/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRootFoldersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user's special folders.
     * </p>
     */
    private java.util.List<FolderMetadata> folders;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The user's special folders.
     * </p>
     * 
     * @return The user's special folders.
     */

    public java.util.List<FolderMetadata> getFolders() {
        return folders;
    }

    /**
     * <p>
     * The user's special folders.
     * </p>
     * 
     * @param folders
     *        The user's special folders.
     */

    public void setFolders(java.util.Collection<FolderMetadata> folders) {
        if (folders == null) {
            this.folders = null;
            return;
        }

        this.folders = new java.util.ArrayList<FolderMetadata>(folders);
    }

    /**
     * <p>
     * The user's special folders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolders(java.util.Collection)} or {@link #withFolders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param folders
     *        The user's special folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersResult withFolders(FolderMetadata... folders) {
        if (this.folders == null) {
            setFolders(new java.util.ArrayList<FolderMetadata>(folders.length));
        }
        for (FolderMetadata ele : folders) {
            this.folders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user's special folders.
     * </p>
     * 
     * @param folders
     *        The user's special folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersResult withFolders(java.util.Collection<FolderMetadata> folders) {
        setFolders(folders);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFolders() != null)
            sb.append("Folders: ").append(getFolders()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRootFoldersResult == false)
            return false;
        DescribeRootFoldersResult other = (DescribeRootFoldersResult) obj;
        if (other.getFolders() == null ^ this.getFolders() == null)
            return false;
        if (other.getFolders() != null && other.getFolders().equals(this.getFolders()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFolders() == null) ? 0 : getFolders().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRootFoldersResult clone() {
        try {
            return (DescribeRootFoldersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
