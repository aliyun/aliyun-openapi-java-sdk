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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.DescribeSupplementResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSupplementResponse extends AcsResponse {

	private String requestId;

	private Long supplementId;

	private String serialNumber;

	private Integer applicationType;

	private Integer supplementStatus;

	private String trademarkNumber;

	private Long sendTime;

	private Long acceptTime;

	private Long sbjExpirationDate;

	private Long acceptExpirationDate;

	private Long operateTime;

	private String officialFile;

	private String content;

	private List<String> userFiles;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSupplementId() {
		return this.supplementId;
	}

	public void setSupplementId(Long supplementId) {
		this.supplementId = supplementId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
	}

	public Integer getSupplementStatus() {
		return this.supplementStatus;
	}

	public void setSupplementStatus(Integer supplementStatus) {
		this.supplementStatus = supplementStatus;
	}

	public String getTrademarkNumber() {
		return this.trademarkNumber;
	}

	public void setTrademarkNumber(String trademarkNumber) {
		this.trademarkNumber = trademarkNumber;
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

	public Long getSbjExpirationDate() {
		return this.sbjExpirationDate;
	}

	public void setSbjExpirationDate(Long sbjExpirationDate) {
		this.sbjExpirationDate = sbjExpirationDate;
	}

	public Long getAcceptExpirationDate() {
		return this.acceptExpirationDate;
	}

	public void setAcceptExpirationDate(Long acceptExpirationDate) {
		this.acceptExpirationDate = acceptExpirationDate;
	}

	public Long getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Long operateTime) {
		this.operateTime = operateTime;
	}

	public String getOfficialFile() {
		return this.officialFile;
	}

	public void setOfficialFile(String officialFile) {
		this.officialFile = officialFile;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getUserFiles() {
		return this.userFiles;
	}

	public void setUserFiles(List<String> userFiles) {
		this.userFiles = userFiles;
	}

	@Override
	public DescribeSupplementResponse getInstance(UnmarshallerContext context) {
		return	DescribeSupplementResponseUnmarshaller.unmarshall(this, context);
	}
}
