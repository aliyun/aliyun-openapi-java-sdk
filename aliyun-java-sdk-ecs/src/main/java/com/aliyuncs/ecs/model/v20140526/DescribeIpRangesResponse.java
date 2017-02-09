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
package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeIpRangesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpRangesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String clusterId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<IpRange> ipRanges;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<IpRange> getIpRanges() {
		return this.ipRanges;
	}

	public void setIpRanges(List<IpRange> ipRanges) {
		this.ipRanges = ipRanges;
	}

	public static class IpRange {

		private String ipAddress;

		private NicType nicType;

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public NicType getNicType() {
			return this.nicType;
		}

		public void setNicType(NicType nicType) {
			this.nicType = nicType;
		}

		public enum NicType {
		
			INTRANET("intranet"),
			INTERNET("internet"),;
			
		    private String stringValue;
		
			NicType(String stringValue) {
		        setStringValue(stringValue);
		    }
		
		    public String getStringValue() {
		        return stringValue;
		    }
		
		    public void setStringValue(String stringValue) {
		        this.stringValue = stringValue;
		    }
		    
		    public static NicType getEnum(String stringValue){
		    	if(null == stringValue){
		    		return null;
		    	}
		    	
		    	for (NicType nicType : NicType.values()) {
					if(nicType.getStringValue().equals(stringValue)){
						return nicType;
					}
				}
		    	return null;
		    }
		}
	}

	@Override
	public DescribeIpRangesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpRangesResponseUnmarshaller.unmarshall(this, context);
	}
}
