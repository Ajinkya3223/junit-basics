package com.example.junitexample.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class GstServiceTest {


    @Mock
    private GstProvider mockProvider;

    @InjectMocks // insertin the peobvider object into gstservice thats why service has @injectmocks
    private GstService gstService;


//    @BeforeEach
//    public void init() {
//
//        MockitoAnnotations.initMocks(this);
//
//    }

    @Test
    public void gstCalculateTest() {


     //  GstProvider provider = new GstProviderImpl();
//       GstProvider mockProvider = Mockito.mock(GstProvider.class);
//
//        GstService gstService = new GstService(mockProvider);

        //important line
        Mockito.when(mockProvider.getGSTDetail()).thenReturn(18);


        //test logic calculateGST
        int actualResult = gstService.calculateGST();
        Assertions.assertEquals(18, actualResult, "Test case failed !!");


    }
}

//class GstProviderImpl implements GstProvider {
//
//    @Override
//    public int getGSTDetail() {
//        return 18;
//    }
//}
