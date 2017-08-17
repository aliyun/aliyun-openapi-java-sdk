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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ShopShowListRequest extends RpcAcsRequest<ShopShowListResponse> {
	
	public ShopShowListRequest() {
		super("cloudwf", "2017-03-28", "ShopShowList");
	}

	private Long gid;

	private String address;

	private String name;

	private String dirc;

	private Integer page;

	private Long bid;

	private Integer per;

	private Integer shopStatus;

	public Long getGid() {
		return this.gid;
	}

	public void setGid(Long gid) {
		this.gid = gid;
		if(gid != null){
			putQueryParameter("Gid", gid.toString());
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDirc() {
		return this.dirc;
	}

	public void setDirc(String dirc) {
		this.dirc = dirc;
		if(dirc != null){
			putQueryParameter("Dirc", dirc);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid.toString());
		}
	}

	public Integer getPer() {
		return this.per;
	}

	public void setPer(Integer per) {
		this.per = per;
		if(per != null){
			putQueryParameter("Per", per.toString());
		}
	}

	public Integer getShopStatus() {
		return this.shopStatus;
	}

	public void setShopStatus(Integer shopStatus) {
		this.shopStatus = shopStatus;
		if(shopStatus != null){
			putQueryParameter("ShopStatus", shopStatus.toString());
		}
	}

	@Override
	public Class<ShopShowListResponse> getResponseClass() {
		return ShopShowListResponse.class;
	}

}
