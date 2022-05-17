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
public class InstallPackageRequest extends RpcAcsRequest<InstallPackageResponse> {
	   

	private String robotCode;

	@SerializedName("packages")
	private List<Packages> packages;

	@SerializedName("operator")
	private Operator operator;
	public InstallPackageRequest() {
		super("RetailBot", "2021-02-24", "InstallPackage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public List<Packages> getPackages() {
		return this.packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;	
		if (packages != null) {
			putBodyParameter("Packages" , new Gson().toJson(packages));
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

	public static class Packages {

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
	public Class<InstallPackageResponse> getResponseClass() {
		return InstallPackageResponse.class;
	}

}
