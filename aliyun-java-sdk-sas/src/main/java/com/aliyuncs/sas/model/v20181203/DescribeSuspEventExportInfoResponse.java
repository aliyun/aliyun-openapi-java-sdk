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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSuspEventExportInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventExportInfoResponse extends AcsResponse {

	private String link;

	private String type;

	private Integer progress;

	private String requestId;

	private Long gmtCreate;

	private String fileName;

	private Integer totalCount;

	private Long gmtModified;

	private String exportStatus;

	private Integer id;

	private String properties;

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getExportStatus() {
		return this.exportStatus;
	}

	public void setExportStatus(String exportStatus) {
		this.exportStatus = exportStatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProperties() {
		return this.properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	@Override
	public DescribeSuspEventExportInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventExportInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
