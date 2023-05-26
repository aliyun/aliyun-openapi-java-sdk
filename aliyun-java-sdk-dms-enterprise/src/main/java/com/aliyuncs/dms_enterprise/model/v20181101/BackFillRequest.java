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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BackFillRequest extends RpcAcsRequest<BackFillResponse> {
	   

	private Long dagId;

	private Long tid;

	private Boolean isTriggerSubTree;

	private String backFillDateEnd;

	private Long historyDagId;

	@SerializedName("startNodeIds")
	private List<Long> startNodeIds;

	@SerializedName("filterNodeIds")
	private List<Long> filterNodeIds;

	private String backFillDateBegin;

	private String backFillDate;

	private Boolean asc;

	private Integer interval;
	public BackFillRequest() {
		super("dms-enterprise", "2018-11-01", "BackFill", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Boolean getIsTriggerSubTree() {
		return this.isTriggerSubTree;
	}

	public void setIsTriggerSubTree(Boolean isTriggerSubTree) {
		this.isTriggerSubTree = isTriggerSubTree;
		if(isTriggerSubTree != null){
			putQueryParameter("IsTriggerSubTree", isTriggerSubTree.toString());
		}
	}

	public String getBackFillDateEnd() {
		return this.backFillDateEnd;
	}

	public void setBackFillDateEnd(String backFillDateEnd) {
		this.backFillDateEnd = backFillDateEnd;
		if(backFillDateEnd != null){
			putQueryParameter("BackFillDateEnd", backFillDateEnd);
		}
	}

	public Long getHistoryDagId() {
		return this.historyDagId;
	}

	public void setHistoryDagId(Long historyDagId) {
		this.historyDagId = historyDagId;
		if(historyDagId != null){
			putQueryParameter("HistoryDagId", historyDagId.toString());
		}
	}

	public List<Long> getStartNodeIds() {
		return this.startNodeIds;
	}

	public void setStartNodeIds(List<Long> startNodeIds) {
		this.startNodeIds = startNodeIds;	
		if (startNodeIds != null) {
			putQueryParameter("StartNodeIds" , new Gson().toJson(startNodeIds));
		}	
	}

	public List<Long> getFilterNodeIds() {
		return this.filterNodeIds;
	}

	public void setFilterNodeIds(List<Long> filterNodeIds) {
		this.filterNodeIds = filterNodeIds;	
		if (filterNodeIds != null) {
			putQueryParameter("FilterNodeIds" , new Gson().toJson(filterNodeIds));
		}	
	}

	public String getBackFillDateBegin() {
		return this.backFillDateBegin;
	}

	public void setBackFillDateBegin(String backFillDateBegin) {
		this.backFillDateBegin = backFillDateBegin;
		if(backFillDateBegin != null){
			putQueryParameter("BackFillDateBegin", backFillDateBegin);
		}
	}

	public String getBackFillDate() {
		return this.backFillDate;
	}

	public void setBackFillDate(String backFillDate) {
		this.backFillDate = backFillDate;
		if(backFillDate != null){
			putQueryParameter("BackFillDate", backFillDate);
		}
	}

	public Boolean getAsc() {
		return this.asc;
	}

	public void setAsc(Boolean asc) {
		this.asc = asc;
		if(asc != null){
			putQueryParameter("Asc", asc.toString());
		}
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	@Override
	public Class<BackFillResponse> getResponseClass() {
		return BackFillResponse.class;
	}

}
