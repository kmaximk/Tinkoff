/*
 * This file is generated by jOOQ.
 */
package edu.java.scrapper.domain.jooq.tables.records;


import edu.java.scrapper.domain.jooq.tables.Databasechangelog;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


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
public class DatabasechangelogRecord extends TableRecordImpl<DatabasechangelogRecord> implements Record14<String, String, String, LocalDateTime, Integer, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.databasechangelog.id</code>.
     */
    public void setId(@NotNull String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.databasechangelog.id</code>.
     */
    @jakarta.validation.constraints.NotNull
    @Size(max = 255)
    @NotNull
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.databasechangelog.author</code>.
     */
    public void setAuthor(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.databasechangelog.author</code>.
     */
    @jakarta.validation.constraints.NotNull
    @Size(max = 255)
    @NotNull
    public String getAuthor() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.databasechangelog.filename</code>.
     */
    public void setFilename(@NotNull String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.databasechangelog.filename</code>.
     */
    @jakarta.validation.constraints.NotNull
    @Size(max = 255)
    @NotNull
    public String getFilename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.databasechangelog.dateexecuted</code>.
     */
    public void setDateexecuted(@NotNull LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.databasechangelog.dateexecuted</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public LocalDateTime getDateexecuted() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.databasechangelog.orderexecuted</code>.
     */
    public void setOrderexecuted(@NotNull Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.databasechangelog.orderexecuted</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getOrderexecuted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.databasechangelog.exectype</code>.
     */
    public void setExectype(@NotNull String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.databasechangelog.exectype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @Size(max = 10)
    @NotNull
    public String getExectype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.databasechangelog.md5sum</code>.
     */
    public void setMd5sum(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.databasechangelog.md5sum</code>.
     */
    @Size(max = 35)
    @Nullable
    public String getMd5sum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.databasechangelog.description</code>.
     */
    public void setDescription(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.databasechangelog.description</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.databasechangelog.comments</code>.
     */
    public void setComments(@Nullable String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.databasechangelog.comments</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getComments() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.databasechangelog.tag</code>.
     */
    public void setTag(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.databasechangelog.tag</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getTag() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.databasechangelog.liquibase</code>.
     */
    public void setLiquibase(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.databasechangelog.liquibase</code>.
     */
    @Size(max = 20)
    @Nullable
    public String getLiquibase() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.databasechangelog.contexts</code>.
     */
    public void setContexts(@Nullable String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.databasechangelog.contexts</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getContexts() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.databasechangelog.labels</code>.
     */
    public void setLabels(@Nullable String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.databasechangelog.labels</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getLabels() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.databasechangelog.deployment_id</code>.
     */
    public void setDeploymentId(@Nullable String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.databasechangelog.deployment_id</code>.
     */
    @Size(max = 10)
    @Nullable
    public String getDeploymentId() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row14<String, String, String, LocalDateTime, Integer, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row14<String, String, String, LocalDateTime, Integer, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return Databasechangelog.DATABASECHANGELOG.ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Databasechangelog.DATABASECHANGELOG.AUTHOR;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return Databasechangelog.DATABASECHANGELOG.FILENAME;
    }

    @Override
    @NotNull
    public Field<LocalDateTime> field4() {
        return Databasechangelog.DATABASECHANGELOG.DATEEXECUTED;
    }

    @Override
    @NotNull
    public Field<Integer> field5() {
        return Databasechangelog.DATABASECHANGELOG.ORDEREXECUTED;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return Databasechangelog.DATABASECHANGELOG.EXECTYPE;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return Databasechangelog.DATABASECHANGELOG.MD5SUM;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return Databasechangelog.DATABASECHANGELOG.DESCRIPTION;
    }

    @Override
    @NotNull
    public Field<String> field9() {
        return Databasechangelog.DATABASECHANGELOG.COMMENTS;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return Databasechangelog.DATABASECHANGELOG.TAG;
    }

    @Override
    @NotNull
    public Field<String> field11() {
        return Databasechangelog.DATABASECHANGELOG.LIQUIBASE;
    }

    @Override
    @NotNull
    public Field<String> field12() {
        return Databasechangelog.DATABASECHANGELOG.CONTEXTS;
    }

    @Override
    @NotNull
    public Field<String> field13() {
        return Databasechangelog.DATABASECHANGELOG.LABELS;
    }

    @Override
    @NotNull
    public Field<String> field14() {
        return Databasechangelog.DATABASECHANGELOG.DEPLOYMENT_ID;
    }

    @Override
    @NotNull
    public String component1() {
        return getId();
    }

    @Override
    @NotNull
    public String component2() {
        return getAuthor();
    }

    @Override
    @NotNull
    public String component3() {
        return getFilename();
    }

    @Override
    @NotNull
    public LocalDateTime component4() {
        return getDateexecuted();
    }

    @Override
    @NotNull
    public Integer component5() {
        return getOrderexecuted();
    }

    @Override
    @NotNull
    public String component6() {
        return getExectype();
    }

    @Override
    @Nullable
    public String component7() {
        return getMd5sum();
    }

    @Override
    @Nullable
    public String component8() {
        return getDescription();
    }

    @Override
    @Nullable
    public String component9() {
        return getComments();
    }

    @Override
    @Nullable
    public String component10() {
        return getTag();
    }

    @Override
    @Nullable
    public String component11() {
        return getLiquibase();
    }

    @Override
    @Nullable
    public String component12() {
        return getContexts();
    }

    @Override
    @Nullable
    public String component13() {
        return getLabels();
    }

    @Override
    @Nullable
    public String component14() {
        return getDeploymentId();
    }

    @Override
    @NotNull
    public String value1() {
        return getId();
    }

    @Override
    @NotNull
    public String value2() {
        return getAuthor();
    }

    @Override
    @NotNull
    public String value3() {
        return getFilename();
    }

    @Override
    @NotNull
    public LocalDateTime value4() {
        return getDateexecuted();
    }

    @Override
    @NotNull
    public Integer value5() {
        return getOrderexecuted();
    }

    @Override
    @NotNull
    public String value6() {
        return getExectype();
    }

    @Override
    @Nullable
    public String value7() {
        return getMd5sum();
    }

    @Override
    @Nullable
    public String value8() {
        return getDescription();
    }

    @Override
    @Nullable
    public String value9() {
        return getComments();
    }

    @Override
    @Nullable
    public String value10() {
        return getTag();
    }

    @Override
    @Nullable
    public String value11() {
        return getLiquibase();
    }

    @Override
    @Nullable
    public String value12() {
        return getContexts();
    }

    @Override
    @Nullable
    public String value13() {
        return getLabels();
    }

    @Override
    @Nullable
    public String value14() {
        return getDeploymentId();
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value1(@NotNull String value) {
        setId(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value2(@NotNull String value) {
        setAuthor(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value3(@NotNull String value) {
        setFilename(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value4(@NotNull LocalDateTime value) {
        setDateexecuted(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value5(@NotNull Integer value) {
        setOrderexecuted(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value6(@NotNull String value) {
        setExectype(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value7(@Nullable String value) {
        setMd5sum(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value8(@Nullable String value) {
        setDescription(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value9(@Nullable String value) {
        setComments(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value10(@Nullable String value) {
        setTag(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value11(@Nullable String value) {
        setLiquibase(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value12(@Nullable String value) {
        setContexts(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value13(@Nullable String value) {
        setLabels(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord value14(@Nullable String value) {
        setDeploymentId(value);
        return this;
    }

    @Override
    @NotNull
    public DatabasechangelogRecord values(@NotNull String value1, @NotNull String value2, @NotNull String value3, @NotNull LocalDateTime value4, @NotNull Integer value5, @NotNull String value6, @Nullable String value7, @Nullable String value8, @Nullable String value9, @Nullable String value10, @Nullable String value11, @Nullable String value12, @Nullable String value13, @Nullable String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatabasechangelogRecord
     */
    public DatabasechangelogRecord() {
        super(Databasechangelog.DATABASECHANGELOG);
    }

    /**
     * Create a detached, initialised DatabasechangelogRecord
     */
    @ConstructorProperties({ "id", "author", "filename", "dateexecuted", "orderexecuted", "exectype", "md5sum", "description", "comments", "tag", "liquibase", "contexts", "labels", "deploymentId" })
    public DatabasechangelogRecord(@NotNull String id, @NotNull String author, @NotNull String filename, @NotNull LocalDateTime dateexecuted, @NotNull Integer orderexecuted, @NotNull String exectype, @Nullable String md5sum, @Nullable String description, @Nullable String comments, @Nullable String tag, @Nullable String liquibase, @Nullable String contexts, @Nullable String labels, @Nullable String deploymentId) {
        super(Databasechangelog.DATABASECHANGELOG);

        setId(id);
        setAuthor(author);
        setFilename(filename);
        setDateexecuted(dateexecuted);
        setOrderexecuted(orderexecuted);
        setExectype(exectype);
        setMd5sum(md5sum);
        setDescription(description);
        setComments(comments);
        setTag(tag);
        setLiquibase(liquibase);
        setContexts(contexts);
        setLabels(labels);
        setDeploymentId(deploymentId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised DatabasechangelogRecord
     */
    public DatabasechangelogRecord(edu.java.scrapper.domain.jooq.tables.pojos.Databasechangelog value) {
        super(Databasechangelog.DATABASECHANGELOG);

        if (value != null) {
            setId(value.getId());
            setAuthor(value.getAuthor());
            setFilename(value.getFilename());
            setDateexecuted(value.getDateexecuted());
            setOrderexecuted(value.getOrderexecuted());
            setExectype(value.getExectype());
            setMd5sum(value.getMd5sum());
            setDescription(value.getDescription());
            setComments(value.getComments());
            setTag(value.getTag());
            setLiquibase(value.getLiquibase());
            setContexts(value.getContexts());
            setLabels(value.getLabels());
            setDeploymentId(value.getDeploymentId());
            resetChangedOnNotNull();
        }
    }
}
