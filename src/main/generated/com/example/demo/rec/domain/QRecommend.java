package com.example.demo.rec.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecommend is a Querydsl query type for Recommend
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecommend extends EntityPathBase<Recommend> {

    private static final long serialVersionUID = 2049514506L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecommend recommend = new QRecommend("recommend");

    public final com.example.demo.anl.domain.QAnalysis analysis;

    public final NumberPath<Integer> recNum = createNumber("recNum", Integer.class);

    public QRecommend(String variable) {
        this(Recommend.class, forVariable(variable), INITS);
    }

    public QRecommend(Path<? extends Recommend> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecommend(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecommend(PathMetadata metadata, PathInits inits) {
        this(Recommend.class, metadata, inits);
    }

    public QRecommend(Class<? extends Recommend> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.analysis = inits.isInitialized("analysis") ? new com.example.demo.anl.domain.QAnalysis(forProperty("analysis"), inits.get("analysis")) : null;
    }

}

