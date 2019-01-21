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

package com.aliyuncs.ons.model.v20180516;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsMessagePageQueryByTopicRequest extends RpcAcsRequest<OnsMessagePageQueryByTopicResponse> {
	
	public OnsMessagePageQueryByTopicRequest() {
		super("Ons", "2018-05-16", "OnsMessagePageQueryByTopic", "2018-05-16");
	}

	private Long preventCache;

	private String onsRegionId;

	private String onsPlatform;

	private Integer pageSize;

	private String topic;

	private Long endTime;

	private Long beginTime;

	private Integer currentPage;

	private String taskId;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		if(onsRegionId != null){
			putQueryParameter("OnsRegionId", onsRegionId);
		}
	}

	public String getOnsPlatform() {
		return this.onsPlatform;
	}

	public void setOnsPlatform(String onsPlatform) {
		this.onsPlatform = onsPlatform;
		if(onsPlatform != null){
			putQueryParameter("OnsPlatform", onsPlatform);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<OnsMessagePageQueryByTopicResponse> getResponseClass() {
		return OnsMessagePageQueryByTopicResponse.class;
	}

}
