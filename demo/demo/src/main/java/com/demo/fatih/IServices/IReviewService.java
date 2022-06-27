package com.demo.fatih.IServices;

import java.util.List;

import org.springframework.web.servlet.view.RedirectView;

public interface IReviewService {

    public List<RedirectView> GettAllReviews();
    
}
