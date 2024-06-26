/*
 * This file is generated by jOOQ.
 */
package edu.java.scrapper.domain.jooq.tables;


import edu.java.scrapper.domain.jooq.Keys;
import edu.java.scrapper.domain.jooq.Public;
import edu.java.scrapper.domain.jooq.tables.records.LinkRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Link extends TableImpl<LinkRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.link</code>
     */
    public static final Link LINK = new Link();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<LinkRecord> getRecordType() {
        return LinkRecord.class;
    }

    /**
     * The column <code>public.link.id</code>.
     */
    public final TableField<LinkRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.link.url</code>.
     */
    public final TableField<LinkRecord, String> URL = createField(DSL.name("url"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.link.last_check_time</code>.
     */
    public final TableField<LinkRecord, OffsetDateTime> LAST_CHECK_TIME = createField(DSL.name("last_check_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.link.updated_at</code>.
     */
    public final TableField<LinkRecord, OffsetDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.link.updates_count</code>.
     */
    public final TableField<LinkRecord, Integer> UPDATES_COUNT = createField(DSL.name("updates_count"), SQLDataType.INTEGER, this, "");

    private Link(Name alias, Table<LinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private Link(Name alias, Table<LinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.link</code> table reference
     */
    public Link(String alias) {
        this(DSL.name(alias), LINK);
    }

    /**
     * Create an aliased <code>public.link</code> table reference
     */
    public Link(Name alias) {
        this(alias, LINK);
    }

    /**
     * Create a <code>public.link</code> table reference
     */
    public Link() {
        this(DSL.name("link"), null);
    }

    public <O extends Record> Link(Table<O> child, ForeignKey<O, LinkRecord> key) {
        super(child, key, LINK);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public Identity<LinkRecord, Long> getIdentity() {
        return (Identity<LinkRecord, Long>) super.getIdentity();
    }

    @Override
    @NotNull
    public UniqueKey<LinkRecord> getPrimaryKey() {
        return Keys.LINK_PKEY;
    }

    @Override
    @NotNull
    public List<UniqueKey<LinkRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.LINK_URL_KEY);
    }

    @Override
    @NotNull
    public Link as(String alias) {
        return new Link(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Link as(Name alias) {
        return new Link(alias, this);
    }

    @Override
    @NotNull
    public Link as(Table<?> alias) {
        return new Link(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Link rename(String name) {
        return new Link(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Link rename(Name name) {
        return new Link(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Link rename(Table<?> name) {
        return new Link(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, OffsetDateTime, OffsetDateTime, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
