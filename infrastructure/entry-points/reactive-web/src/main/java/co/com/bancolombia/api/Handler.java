package co.com.bancolombia.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class Handler {
    private static final Logger log = LoggerFactory.getLogger(Handler.class);
//private  final UseCase useCase;
//private  final UseCase2 useCase2;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        var response = Map.of("name", "cristian");
        log.info(response.toString());
        return ServerResponse.ok().bodyValue(response);
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();
        var response = Map.of("name", "fluent-output");
        log.info(response.toString());
        return ServerResponse.ok().bodyValue(response);
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        var response = Map.of("name", "fluent-output");
        log.info(response.toString());
        return ServerResponse.ok().bodyValue(response);
    }
}
