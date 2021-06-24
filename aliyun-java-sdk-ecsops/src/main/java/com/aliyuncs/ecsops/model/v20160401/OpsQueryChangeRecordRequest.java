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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryChangeRecordRequest extends RpcAcsRequest<OpsQueryChangeRecordResponse> {
	   

	private String app;

	private String changeTimeEnd;

	private String sourceSystem;

	private String changeCategory;

	private String content;

	private String changeTimeStart;

	private Integer pageNo;

	private Integer pageSize;

	private List<String> executorss;

	private String auditParamStr;
	public OpsQueryChangeRecordRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryChangeRecord", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getChangeTimeEnd() {
		return this.changeTimeEnd;
	}

	public void setChangeTimeEnd(String changeTimeEnd) {
		this.changeTimeEnd = changeTimeEnd;
		if(changeTimeEnd != null){
			putQueryParameter("ChangeTimeEnd", changeTimeEnd);
		}
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
		if(sourceSystem != null){
			putQueryParameter("SourceSystem", sourceSystem);
		}
	}

	public String getChangeCategory() {
		return this.changeCategory;
	}

	public void setChangeCategory(String changeCategory) {
		this.changeCategory = changeCategory;
		if(changeCategory != null){
			putQueryParameter("ChangeCategory", changeCategory);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getChangeTimeStart() {
		return this.changeTimeStart;
	}

	public void setChangeTimeStart(String changeTimeStart) {
		this.changeTimeStart = changeTimeStart;
		if(changeTimeStart != null){
			putQueryParameter("ChangeTimeStart", changeTimeStart);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public List<String> getExecutorss() {
		return this.executorss;
	}

	public void setExecutorss(List<String> executorss) {
		this.executorss = executorss;	
		if (executorss != null) {
			for (int i = 0; i < executorss.size(); i++) {
				putQueryParameter("Executors." + (i + 1) , executorss.get(i));
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryChangeRecordResponse> getResponseClass() {
		return OpsQueryChangeRecordResponse.class;
	}

}
