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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceHAConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceHAConfigResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String syncMode;

	private String hAMode;

	private List<TaskProgressInfo> hostInstanceInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getSyncMode() {
		return this.syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}

	public String getHAMode() {
		return this.hAMode;
	}

	public void setHAMode(String hAMode) {
		this.hAMode = hAMode;
	}

	public List<TaskProgressInfo> getHostInstanceInfos() {
		return this.hostInstanceInfos;
	}

	public void setHostInstanceInfos(List<TaskProgressInfo> hostInstanceInfos) {
		this.hostInstanceInfos = hostInstanceInfos;
	}

	public static class TaskProgressInfo {

		private String nodeId;

		private String region;

		private String logDelay;

		private String dataDelay;

		private String nodeType;

		private String zoneId;

		private SyncStatus syncStatus;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getLogDelay() {
			return this.logDelay;
		}

		public void setLogDelay(String logDelay) {
			this.logDelay = logDelay;
		}

		public String getDataDelay() {
			return this.dataDelay;
		}

		public void setDataDelay(String dataDelay) {
			this.dataDelay = dataDelay;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public SyncStatus getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(SyncStatus syncStatus) {
			this.syncStatus = syncStatus;
		}

		public enum SyncStatus {
		
			AVAILABLE("Available"),
			NOT_AVAILABLE("NotAvailable"),;
			
		    private String stringValue;
		
			SyncStatus(String stringValue) {
		        setStringValue(stringValue);
		    }
		
		    public String getStringValue() {
		        return stringValue;
		    }
		
		    public void setStringValue(String stringValue) {
		        this.stringValue = stringValue;
		    }
		    
		    public static SyncStatus getEnum(String stringValue){
		    	if(null == stringValue){
		    		return null;
		    	}
		    	
		    	for (SyncStatus syncStatus : SyncStatus.values()) {
					if(syncStatus.getStringValue().equals(stringValue)){
						return syncStatus;
					}
				}
		    	return null;
		    }
		}
	}

	@Override
	public DescribeDBInstanceHAConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceHAConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
