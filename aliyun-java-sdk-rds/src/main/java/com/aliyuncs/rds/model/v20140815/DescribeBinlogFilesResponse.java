/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeBinlogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeBinlogFilesResponse extends AcsResponse {

    private String requestId;

    private Integer totalRecordCount;

    private Integer pageNumber;

    private Integer pageRecordCount;

    private Long totalFileSize;

    private List<BinLogFile> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
    }

    public List<BinLogFile> getItems() {
        return this.items;
    }

    public void setItems(List<BinLogFile> items) {
        this.items = items;
    }

    public static class BinLogFile {

        private Long fileSize;

        private String logBeginTime;

        private String logEndTime;

        private String downloadLink;

        private String intranetDownloadLink;

        private String linkExpiredTime;

        private String checksum;

        private String hostInstanceID;

        public Long getFileSize() {
            return this.fileSize;
        }

        public void setFileSize(Long fileSize) {
            this.fileSize = fileSize;
        }

        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public void setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
        }

        public String getLogEndTime() {
            return this.logEndTime;
        }

        public void setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
        }

        public String getDownloadLink() {
            return this.downloadLink;
        }

        public void setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
        }

        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public void setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
        }

        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public void setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
        }

        public String getChecksum() {
            return this.checksum;
        }

        public void setChecksum(String checksum) {
            this.checksum = checksum;
        }

        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public void setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
        }
    }

    @Override
    public DescribeBinlogFilesResponse getInstance(UnmarshallerContext context) {
        return DescribeBinlogFilesResponseUnmarshaller.unmarshall(this, context);
    }
}
