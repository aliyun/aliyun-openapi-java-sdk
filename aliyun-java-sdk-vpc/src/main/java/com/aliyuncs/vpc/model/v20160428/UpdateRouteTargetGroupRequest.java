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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRouteTargetGroupRequest extends RpcAcsRequest<UpdateRouteTargetGroupResponse> {
	   

	private String clientToken;

	private String routeTargetGroupId;

	private List<RouteTargetMemberList> routeTargetMemberLists;

	private String routeTargetGroupName;

	private String routeTargetGroupDescription;
	public UpdateRouteTargetGroupRequest() {
		super("Vpc", "2016-04-28", "UpdateRouteTargetGroup", "vpc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getRouteTargetGroupId() {
		return this.routeTargetGroupId;
	}

	public void setRouteTargetGroupId(String routeTargetGroupId) {
		this.routeTargetGroupId = routeTargetGroupId;
		if(routeTargetGroupId != null){
			putQueryParameter("RouteTargetGroupId", routeTargetGroupId);
		}
	}

	public List<RouteTargetMemberList> getRouteTargetMemberLists() {
		return this.routeTargetMemberLists;
	}

	public void setRouteTargetMemberLists(List<RouteTargetMemberList> routeTargetMemberLists) {
		this.routeTargetMemberLists = routeTargetMemberLists;	
		if (routeTargetMemberLists != null) {
			for (int depth1 = 0; depth1 < routeTargetMemberLists.size(); depth1++) {
				putQueryParameter("RouteTargetMemberList." + (depth1 + 1) + ".MemberId" , routeTargetMemberLists.get(depth1).getMemberId());
				putQueryParameter("RouteTargetMemberList." + (depth1 + 1) + ".MemberType" , routeTargetMemberLists.get(depth1).getMemberType());
				putQueryParameter("RouteTargetMemberList." + (depth1 + 1) + ".Weight" , routeTargetMemberLists.get(depth1).getWeight());
			}
		}	
	}

	public String getRouteTargetGroupName() {
		return this.routeTargetGroupName;
	}

	public void setRouteTargetGroupName(String routeTargetGroupName) {
		this.routeTargetGroupName = routeTargetGroupName;
		if(routeTargetGroupName != null){
			putQueryParameter("RouteTargetGroupName", routeTargetGroupName);
		}
	}

	public String getRouteTargetGroupDescription() {
		return this.routeTargetGroupDescription;
	}

	public void setRouteTargetGroupDescription(String routeTargetGroupDescription) {
		this.routeTargetGroupDescription = routeTargetGroupDescription;
		if(routeTargetGroupDescription != null){
			putQueryParameter("RouteTargetGroupDescription", routeTargetGroupDescription);
		}
	}

	public static class RouteTargetMemberList {

		private String memberId;

		private String memberType;

		private Integer weight;

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberType() {
			return this.memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}
	}

	@Override
	public Class<UpdateRouteTargetGroupResponse> getResponseClass() {
		return UpdateRouteTargetGroupResponse.class;
	}

}
