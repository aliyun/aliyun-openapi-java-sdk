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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveUmengPagePermission4RootRequest extends RpcAcsRequest<SaveUmengPagePermission4RootResponse> {
	
	public SaveUmengPagePermission4RootRequest() {
		super("cloudwf", "2017-03-28", "SaveUmengPagePermission4Root", "cloudwf");
	}

	private String gsPermission;

	private Long aliyunPk;

	private Long pagePermission;

	private Long id;

	private Long bid;

	public String getGsPermission() {
		return this.gsPermission;
	}

	public void setGsPermission(String gsPermission) {
		this.gsPermission = gsPermission;
		if(gsPermission != null){
			putQueryParameter("GsPermission", gsPermission);
		}
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public Long getPagePermission() {
		return this.pagePermission;
	}

	public void setPagePermission(Long pagePermission) {
		this.pagePermission = pagePermission;
		if(pagePermission != null){
			putQueryParameter("PagePermission", pagePermission.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	@Override
	public Class<SaveUmengPagePermission4RootResponse> getResponseClass() {
		return SaveUmengPagePermission4RootResponse.class;
	}

}
