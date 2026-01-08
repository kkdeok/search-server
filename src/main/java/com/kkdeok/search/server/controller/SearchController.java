package com.kkdeok.search.server.controller;

import com.kkdeok.idl.apis.search.v1.SearchRequest;
import com.kkdeok.idl.apis.search.v1.SearchResponse;
import com.kkdeok.idl.apis.search.v1.SearchServiceGrpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SearchController extends SearchServiceGrpc.SearchServiceImplBase {

    @Override
    public void search(SearchRequest request, StreamObserver<SearchResponse> responseObserver) {
        // Implement your search logic here
        SearchResponse response = SearchResponse.newBuilder()
            .addHits("hello world")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
