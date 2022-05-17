/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpgradePackageRequest extends RpcAcsRequest<UpgradePackageResponse> {
	   

	@SerializedName("robotCodes")
	private List<String> robotCodes;

	@SerializedName("packageDTO")
	private PackageDTO packageDTO;

	@SerializedName("operator")
	private Operator operator;
	public UpgradePackageRequest() {
		super("RetailBot", "2021-02-24", "UpgradePackage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getRobotCodes() {
		return this.robotCodes;
	}

	public void setRobotCodes(List<String> robotCodes) {
		this.robotCodes = robotCodes;	
		if (robotCodes != null) {
			putBodyParameter("RobotCodes" , new Gson().toJson(robotCodes));
		}	
	}

	public PackageDTO getPackageDTO() {
		return this.packageDTO;
	}

	public void setPackageDTO(PackageDTO packageDTO) {
		this.packageDTO = packageDTO;	
		if (packageDTO != null) {
			putBodyParameter("PackageDTO" , new Gson().toJson(packageDTO));
		}	
	}

	public Operator getOperator() {
		return this.operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;	
		if (operator != null) {
			putBodyParameter("Operator" , new Gson().toJson(operator));
		}	
	}

	public static class PackageDTO {

		@SerializedName("PackageCode")
		private String packageCode;

		@SerializedName("PackageVersion")
		private String packageVersion;

		public String getPackageCode() {
			return this.packageCode;
		}

		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}
	}

	public static class Operator {

		@SerializedName("OperatorId")
		private String operatorId;

		@SerializedName("OperatorName")
		private String operatorName;

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
	}

	@Override
	public Class<UpgradePackageResponse> getResponseClass() {
		return UpgradePackageResponse.class;
	}

}
