package com.bitcamp.api.article;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.repository.ArticleRepository;
import com.bitcamp.api.article.service.ArticleService;
import com.bitcamp.api.article.service.ArticleServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ArticleServiceImplTest {

    private ArticleService service;
    private static Article testArticle;
    @Mock
    private ArticleRepository repository;
    @BeforeEach
    void setup() {
        this.service = new ArticleServiceImpl(repository);
    }

    @BeforeEach
    void init(){
        testArticle = Article.of( 1L, "테스트제목","테스트 글");
    }

    @Test
    public void 게시글_제목_검색()throws Exception {
        // Given
        repository.save(testArticle);

        // When
        Article article = repository.findById(1L).get();
        System.out.println("---------- article tostring --------");
        System.out.println(article);

        // Then
        assertThat(article.getTitle())
        .isEqualTo("테스트제목");
    }


    @Test
    public void 게시글_전체_검색()throws Exception {
       
        List<Article> articles = getList();
        BDDMockito.given(repository.findAll()).willReturn(articles);
        List<ArticleDto> list = service.findAll();
        assertThat(list.size())
        .isEqualTo(3);
        
        // verify(repository, times(1)).findById(1L);
        // verify(repository, never()).findAll();
        // verifyNoInteractions(repository);
    }
    private List<Article> getList() {
        return Arrays.asList(
            Article.builder().id(1L).title("유관순").content("유관순은 3.1운동 주역이었다").build(),
            Article.builder().id(2L).title("김구").content("김구는 임시정부 주역이었다").build(),
            Article.builder().id(3L).title("윤봉길").content("윤봉길은 독립운동가이다").build()
        );
    }

    
}
