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
import com.aliyuncs.hpc.transform.v20161213.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private String regionId;

		private InstanceType instanceType;

		private PackageId packageId;

		private Status status;

		private String innerIpAddress;

		private JumpserverStatus jumpserverStatus;

		private String jumpserverInnerIpAddress;

		private String jumpServerPublicIpAddress;

		private String creationTime;

		private String expireTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public InstanceType getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(InstanceType instanceType) {
			this.instanceType = instanceType;
		}

		public PackageId getPackageId() {
			return this.packageId;
		}

		public void setPackageId(PackageId packageId) {
			this.packageId = packageId;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public JumpserverStatus getJumpserverStatus() {
			return this.jumpserverStatus;
		}

		public void setJumpserverStatus(JumpserverStatus jumpserverStatus) {
			this.jumpserverStatus = jumpserverStatus;
		}

		public String getJumpserverInnerIpAddress() {
			return this.jumpserverInnerIpAddress;
		}

		public void setJumpserverInnerIpAddress(String jumpserverInnerIpAddress) {
			this.jumpserverInnerIpAddress = jumpserverInnerIpAddress;
		}

		public String getJumpServerPublicIpAddress() {
			return this.jumpServerPublicIpAddress;
		}

		public void setJumpServerPublicIpAddress(String jumpServerPublicIpAddress) {
			this.jumpServerPublicIpAddress = jumpServerPublicIpAddress;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

public enum InstanceType {

			P_R_E_P_A_Y("PREPAY"),
			P_O_S_T_P_A_Y("POSTPAY"),;
	
    private String stringValue;

	InstanceType(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static InstanceType getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (InstanceType instanceType : InstanceType.values()) {
			if(instanceType.getStringValue().equals(stringValue)){
				return instanceType;
			}
		}
    	return null;
    }
}

public enum PackageId {

			G4("G4"),
			G2("G2"),;
	
    private String stringValue;

	PackageId(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static PackageId getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (PackageId packageId : PackageId.values()) {
			if(packageId.getStringValue().equals(stringValue)){
				return packageId;
			}
		}
    	return null;
    }
}

public enum Status {

			S_T_O_P_P_E_D("STOPPED"),
			S_T_O_P_P_I_N_G("STOPPING"),
			R_U_N_N_I_N_G("RUNNING"),
			O_F_F_L_I_N_E("OFFLINE"),
			S_T_A_R_T_I_N_G("STARTING"),;
	
    private String stringValue;

	Status(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static Status getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (Status status : Status.values()) {
			if(status.getStringValue().equals(stringValue)){
				return status;
			}
		}
    	return null;
    }
}

public enum JumpserverStatus {

			S_T_O_P_P_E_D("STOPPED"),
			S_T_O_P_P_I_N_G("STOPPING"),
			R_U_N_N_I_N_G("RUNNING"),
			S_T_A_R_T_I_N_G("STARTING"),;
	
    private String stringValue;

	JumpserverStatus(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static JumpserverStatus getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (JumpserverStatus jumpserverStatus : JumpserverStatus.values()) {
			if(jumpserverStatus.getStringValue().equals(stringValue)){
				return jumpserverStatus;
			}
		}
    	return null;
    }
}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
