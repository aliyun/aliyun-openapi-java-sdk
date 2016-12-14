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
package com.aliyuncs.hpc.model.v20161213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hpc.transform.v20161213.DescribeSecurityGroupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityGroupAttributeResponse extends AcsResponse {

	private Records records;

	public Records getRecords() {
		return this.records;
	}

	public void setRecords(Records records) {
		this.records = records;
	}

	public static class Records {

		private String regionId;

		private List<Permission> permissions;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Permission> getPermissions() {
			return this.permissions;
		}

		public void setPermissions(List<Permission> permissions) {
			this.permissions = permissions;
		}

		public static class Permission {

			private String sourceIp;

			private Policy policy;

			private NicType nicType;

			private String priority;

			private String time;

			public String getSourceIp() {
				return this.sourceIp;
			}

			public void setSourceIp(String sourceIp) {
				this.sourceIp = sourceIp;
			}

			public Policy getPolicy() {
				return this.policy;
			}

			public void setPolicy(Policy policy) {
				this.policy = policy;
			}

			public NicType getNicType() {
				return this.nicType;
			}

			public void setNicType(NicType nicType) {
				this.nicType = nicType;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

public enum Policy {

					DROP("drop"),
					ACCEPT("accept"),;
	
    private String stringValue;

	Policy(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static Policy getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (Policy policy : Policy.values()) {
			if(policy.getStringValue().equals(stringValue)){
				return policy;
			}
		}
    	return null;
    }
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
	}

	@Override
	public DescribeSecurityGroupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityGroupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
