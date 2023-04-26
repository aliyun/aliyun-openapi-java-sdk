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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListVccRouteEntriesRequest extends RpcAcsRequest<ListVccRouteEntriesResponse> {
	   

	private Integer pageNumber;

	private String routeType;

	private Integer pageSize;

	private String nextHopId;

	private String vccId;

	private String nextHopType;

	private String vpdRouteEntryId;

	private String destinationCidrBlock;

	private Boolean enablePage;

	private String status;
	public ListVccRouteEntriesRequest() {
		super("eflo", "2022-05-30", "ListVccRouteEntries", "eflo");
		setMethod(MethodType.POST);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRouteType() {
		return this.routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
		if(routeType != null){
			putBodyParameter("RouteType", routeType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getNextHopId() {
		return this.nextHopId;
	}

	public void setNextHopId(String nextHopId) {
		this.nextHopId = nextHopId;
		if(nextHopId != null){
			putBodyParameter("NextHopId", nextHopId);
		}
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public String getNextHopType() {
		return this.nextHopType;
	}

	public void setNextHopType(String nextHopType) {
		this.nextHopType = nextHopType;
		if(nextHopType != null){
			putBodyParameter("NextHopType", nextHopType);
		}
	}

	public String getVpdRouteEntryId() {
		return this.vpdRouteEntryId;
	}

	public void setVpdRouteEntryId(String vpdRouteEntryId) {
		this.vpdRouteEntryId = vpdRouteEntryId;
		if(vpdRouteEntryId != null){
			putBodyParameter("VpdRouteEntryId", vpdRouteEntryId);
		}
	}

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListVccRouteEntriesResponse> getResponseClass() {
		return ListVccRouteEntriesResponse.class;
	}

}
