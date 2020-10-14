package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 610961282707170195L;

    private final BeerDto beerDto;
}
