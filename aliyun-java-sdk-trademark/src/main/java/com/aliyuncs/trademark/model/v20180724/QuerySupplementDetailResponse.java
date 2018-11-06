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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QuerySupplementDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySupplementDetailResponse extends AcsResponse {

	private String requestId;

	private Long id;

	private String serialNumber;

	private Integer type;

	private Integer status;

	private String orderId;

	private String tmNumber;

	private Long sendTime;

	private Long acceptTime;

	private Long sbjDeadTime;

	private Long acceptDeadTime;

	private Long operateTime;

	private String uploadFileTemplateUrl;

	private String content;

	private String batchNum;

	private List<String> fileTemplateUrls;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
	}

	public Long getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	public Long getAcceptTime() {
		return this.acceptTime;
	}

	public void setAcceptTime(Long acceptTime) {
		this.acceptTime = acceptTime;
	}

	public Long getSbjDeadTime() {
		return this.sbjDeadTime;
	}

	public void setSbjDeadTime(Long sbjDeadTime) {
		this.sbjDeadTime = sbjDeadTime;
	}

	public Long getAcceptDeadTime() {
		return this.acceptDeadTime;
	}

	public void setAcceptDeadTime(Long acceptDeadTime) {
		this.acceptDeadTime = acceptDeadTime;
	}

	public Long getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Long operateTime) {
		this.operateTime = operateTime;
	}

	public String getUploadFileTemplateUrl() {
		return this.uploadFileTemplateUrl;
	}

	public void setUploadFileTemplateUrl(String uploadFileTemplateUrl) {
		this.uploadFileTemplateUrl = uploadFileTemplateUrl;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBatchNum() {
		return this.batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public List<String> getFileTemplateUrls() {
		return this.fileTemplateUrls;
	}

	public void setFileTemplateUrls(List<String> fileTemplateUrls) {
		this.fileTemplateUrls = fileTemplateUrls;
	}

	@Override
	public QuerySupplementDetailResponse getInstance(UnmarshallerContext context) {
		return	QuerySupplementDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
