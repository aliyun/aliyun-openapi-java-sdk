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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSQLLogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogFilesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<LogFile> items;

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

	public List<LogFile> getItems() {
		return this.items;
	}

	public void setItems(List<LogFile> items) {
		this.items = items;
	}

	public static class LogFile {

		private String fileID;

		private LogStatus logStatus;

		private String logDownloadURL;

		private String logSize;

		private String logStartTime;

		private String logEndTime;

		public String getFileID() {
			return this.fileID;
		}

		public void setFileID(String fileID) {
			this.fileID = fileID;
		}

		public LogStatus getLogStatus() {
			return this.logStatus;
		}

		public void setLogStatus(LogStatus logStatus) {
			this.logStatus = logStatus;
		}

		public String getLogDownloadURL() {
			return this.logDownloadURL;
		}

		public void setLogDownloadURL(String logDownloadURL) {
			this.logDownloadURL = logDownloadURL;
		}

		public String getLogSize() {
			return this.logSize;
		}

		public void setLogSize(String logSize) {
			this.logSize = logSize;
		}

		public String getLogStartTime() {
			return this.logStartTime;
		}

		public void setLogStartTime(String logStartTime) {
			this.logStartTime = logStartTime;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}

		public enum LogStatus {
		
			GENERATING("Generating"),
			NO_START("NoStart"),
			FAILED("Failed"),
			SUCCESS("Success"),;
			
		    private String stringValue;
		
			LogStatus(String stringValue) {
		        setStringValue(stringValue);
		    }
		
		    public String getStringValue() {
		        return stringValue;
		    }
		
		    public void setStringValue(String stringValue) {
		        this.stringValue = stringValue;
		    }
		    
		    public static LogStatus getEnum(String stringValue){
		    	if(null == stringValue){
		    		return null;
		    	}
		    	
		    	for (LogStatus logStatus : LogStatus.values()) {
					if(logStatus.getStringValue().equals(stringValue)){
						return logStatus;
					}
				}
		    	return null;
		    }
		}
	}

	@Override
	public DescribeSQLLogFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
