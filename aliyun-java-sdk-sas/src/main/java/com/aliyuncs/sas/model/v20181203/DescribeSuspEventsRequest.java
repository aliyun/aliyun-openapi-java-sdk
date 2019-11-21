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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsRequest extends RpcAcsRequest<DescribeSuspEventsResponse> {
	   

	private String remark;

	private String sourceIp;

	private String pageSize;

	private String from;

	private String lang;

	private String alarmUniqueInfo;

	private String dealed;

	private String currentPage;

	private String name;

	private String levels;

	private String parentEventTypes;
	public DescribeSuspEventsRequest() {
		super("Sas", "2018-12-03", "DescribeSuspEvents", "sas");
		setMethod(MethodType.POST);
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getAlarmUniqueInfo() {
		return this.alarmUniqueInfo;
	}

	public void setAlarmUniqueInfo(String alarmUniqueInfo) {
		this.alarmUniqueInfo = alarmUniqueInfo;
		if(alarmUniqueInfo != null){
			putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public String getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage);
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

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
		if(levels != null){
			putQueryParameter("Levels", levels);
		}
	}

	public String getParentEventTypes() {
		return this.parentEventTypes;
	}

	public void setParentEventTypes(String parentEventTypes) {
		this.parentEventTypes = parentEventTypes;
		if(parentEventTypes != null){
			putQueryParameter("ParentEventTypes", parentEventTypes);
		}
	}

	@Override
	public Class<DescribeSuspEventsResponse> getResponseClass() {
		return DescribeSuspEventsResponse.class;
	}

}
