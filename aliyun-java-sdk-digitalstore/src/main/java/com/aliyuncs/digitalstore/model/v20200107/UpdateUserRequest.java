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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	   

	private String mail;

	private List<Roles> roless;

	private String remark;

	private List<Factories> factoriess;

	private Long userId;

	private List<Stores> storess;

	private List<Warehouses> warehousess;

	private String telephone;

	private String userName;

	private Integer status;
	public UpdateUserRequest() {
		super("digitalstore", "2020-01-07", "UpdateUser", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
		if(mail != null){
			putBodyParameter("Mail", mail);
		}
	}

	public List<Roles> getRoless() {
		return this.roless;
	}

	public void setRoless(List<Roles> roless) {
		this.roless = roless;	
		if (roless != null) {
			for (int depth1 = 0; depth1 < roless.size(); depth1++) {
				putBodyParameter("Roles." + (depth1 + 1) + ".RoleName" , roless.get(depth1).getRoleName());
				putBodyParameter("Roles." + (depth1 + 1) + ".RoleId" , roless.get(depth1).getRoleId());
			}
		}	
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public List<Factories> getFactoriess() {
		return this.factoriess;
	}

	public void setFactoriess(List<Factories> factoriess) {
		this.factoriess = factoriess;	
		if (factoriess != null) {
			for (int depth1 = 0; depth1 < factoriess.size(); depth1++) {
				putBodyParameter("Factories." + (depth1 + 1) + ".UnitId" , factoriess.get(depth1).getUnitId());
			}
		}	
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId.toString());
		}
	}

	public List<Stores> getStoress() {
		return this.storess;
	}

	public void setStoress(List<Stores> storess) {
		this.storess = storess;	
		if (storess != null) {
			for (int depth1 = 0; depth1 < storess.size(); depth1++) {
				putBodyParameter("Stores." + (depth1 + 1) + ".UnitId" , storess.get(depth1).getUnitId());
			}
		}	
	}

	public List<Warehouses> getWarehousess() {
		return this.warehousess;
	}

	public void setWarehousess(List<Warehouses> warehousess) {
		this.warehousess = warehousess;	
		if (warehousess != null) {
			for (int depth1 = 0; depth1 < warehousess.size(); depth1++) {
				putBodyParameter("Warehouses." + (depth1 + 1) + ".UnitId" , warehousess.get(depth1).getUnitId());
			}
		}	
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
		if(telephone != null){
			putBodyParameter("Telephone", telephone);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public static class Roles {

		private String roleName;

		private String roleId;

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}
	}

	public static class Factories {

		private String unitId;

		public String getUnitId() {
			return this.unitId;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}
	}

	public static class Stores {

		private String unitId;

		public String getUnitId() {
			return this.unitId;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}
	}

	public static class Warehouses {

		private String unitId;

		public String getUnitId() {
			return this.unitId;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
