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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeLinklogHitspercentagesRequest extends RpcAcsRequest<GetLinkeLinklogHitspercentagesResponse> {
	   

	private Long failCount;

	private String endText;

	private String storeName;

	private String beginText;

	private String failPercentText;

	private Long storeId;

	private List<Long> storeIdsRepeatLists;

	private Long end;

	private Long hitCount;

	private Long totalCount;

	private String hitPercent;

	private String failPercent;

	private List<String> knowledgeHitsPercentageListRepeatLists;

	private String hitPercentText;

	private Long begin;
	public GetLinkeLinklogHitspercentagesRequest() {
		super("SOFA", "2019-08-15", "GetLinkeLinklogHitspercentages", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFailCount() {
		return this.failCount;
	}

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
		if(failCount != null){
			putBodyParameter("FailCount", failCount.toString());
		}
	}

	public String getEndText() {
		return this.endText;
	}

	public void setEndText(String endText) {
		this.endText = endText;
		if(endText != null){
			putBodyParameter("EndText", endText);
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putBodyParameter("StoreName", storeName);
		}
	}

	public String getBeginText() {
		return this.beginText;
	}

	public void setBeginText(String beginText) {
		this.beginText = beginText;
		if(beginText != null){
			putBodyParameter("BeginText", beginText);
		}
	}

	public String getFailPercentText() {
		return this.failPercentText;
	}

	public void setFailPercentText(String failPercentText) {
		this.failPercentText = failPercentText;
		if(failPercentText != null){
			putBodyParameter("FailPercentText", failPercentText);
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public List<Long> getStoreIdsRepeatLists() {
		return this.storeIdsRepeatLists;
	}

	public void setStoreIdsRepeatLists(List<Long> storeIdsRepeatLists) {
		this.storeIdsRepeatLists = storeIdsRepeatLists;	
		if (storeIdsRepeatLists != null) {
			for (int i = 0; i < storeIdsRepeatLists.size(); i++) {
				putBodyParameter("StoreIdsRepeatList." + (i + 1) , storeIdsRepeatLists.get(i));
			}
		}	
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public Long getHitCount() {
		return this.hitCount;
	}

	public void setHitCount(Long hitCount) {
		this.hitCount = hitCount;
		if(hitCount != null){
			putBodyParameter("HitCount", hitCount.toString());
		}
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
		if(totalCount != null){
			putBodyParameter("TotalCount", totalCount.toString());
		}
	}

	public String getHitPercent() {
		return this.hitPercent;
	}

	public void setHitPercent(String hitPercent) {
		this.hitPercent = hitPercent;
		if(hitPercent != null){
			putBodyParameter("HitPercent", hitPercent);
		}
	}

	public String getFailPercent() {
		return this.failPercent;
	}

	public void setFailPercent(String failPercent) {
		this.failPercent = failPercent;
		if(failPercent != null){
			putBodyParameter("FailPercent", failPercent);
		}
	}

	public List<String> getKnowledgeHitsPercentageListRepeatLists() {
		return this.knowledgeHitsPercentageListRepeatLists;
	}

	public void setKnowledgeHitsPercentageListRepeatLists(List<String> knowledgeHitsPercentageListRepeatLists) {
		this.knowledgeHitsPercentageListRepeatLists = knowledgeHitsPercentageListRepeatLists;	
		if (knowledgeHitsPercentageListRepeatLists != null) {
			for (int i = 0; i < knowledgeHitsPercentageListRepeatLists.size(); i++) {
				putBodyParameter("KnowledgeHitsPercentageListRepeatList." + (i + 1) , knowledgeHitsPercentageListRepeatLists.get(i));
			}
		}	
	}

	public String getHitPercentText() {
		return this.hitPercentText;
	}

	public void setHitPercentText(String hitPercentText) {
		this.hitPercentText = hitPercentText;
		if(hitPercentText != null){
			putBodyParameter("HitPercentText", hitPercentText);
		}
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin.toString());
		}
	}

	@Override
	public Class<GetLinkeLinklogHitspercentagesResponse> getResponseClass() {
		return GetLinkeLinklogHitspercentagesResponse.class;
	}

}
