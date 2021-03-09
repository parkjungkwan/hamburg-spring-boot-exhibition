package com.example.demo.uss.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserDateAudit is a Querydsl query type for UserDateAudit
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QUserDateAudit extends EntityPathBase<UserDateAudit> {

    private static final long serialVersionUID = -592704085L;

    public static final QUserDateAudit userDateAudit = new QUserDateAudit("userDateAudit");

    public final QDateAudit _super = new QDateAudit(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    public final NumberPath<Long> updatedBy = createNumber("updatedBy", Long.class);

    public QUserDateAudit(String variable) {
        super(UserDateAudit.class, forVariable(variable));
    }

    public QUserDateAudit(Path<? extends UserDateAudit> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDateAudit(PathMetadata metadata) {
        super(UserDateAudit.class, metadata);
    }

}

