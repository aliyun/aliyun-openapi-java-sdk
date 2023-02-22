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
import com.aliyuncs.sas.transform.v20181203.DescribeVulNumStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulNumStatisticsResponse extends AcsResponse {

	private Integer imageVulAsapSum;

	private Integer appNum;

	private Integer imageVulLaterSum;

	private Integer scaNum;

	private Integer vulLaterSum;

	private Integer appCnt;

	private Integer cveNum;

	private Integer emgNum;

	private Integer cmsDealedTotalNum;

	private Integer vulDealedTotalNum;

	private Integer vulNntfSum;

	private Integer cmsNum;

	private String requestId;

	private Integer vulAsapSum;

	private Integer imageVulNntfSum;

	private Integer sysNum;

	private Integer imageVulTotalSum;

	public Integer getImageVulAsapSum() {
		return this.imageVulAsapSum;
	}

	public void setImageVulAsapSum(Integer imageVulAsapSum) {
		this.imageVulAsapSum = imageVulAsapSum;
	}

	public Integer getAppNum() {
		return this.appNum;
	}

	public void setAppNum(Integer appNum) {
		this.appNum = appNum;
	}

	public Integer getImageVulLaterSum() {
		return this.imageVulLaterSum;
	}

	public void setImageVulLaterSum(Integer imageVulLaterSum) {
		this.imageVulLaterSum = imageVulLaterSum;
	}

	public Integer getScaNum() {
		return this.scaNum;
	}

	public void setScaNum(Integer scaNum) {
		this.scaNum = scaNum;
	}

	public Integer getVulLaterSum() {
		return this.vulLaterSum;
	}

	public void setVulLaterSum(Integer vulLaterSum) {
		this.vulLaterSum = vulLaterSum;
	}

	public Integer getAppCnt() {
		return this.appCnt;
	}

	public void setAppCnt(Integer appCnt) {
		this.appCnt = appCnt;
	}

	public Integer getCveNum() {
		return this.cveNum;
	}

	public void setCveNum(Integer cveNum) {
		this.cveNum = cveNum;
	}

	public Integer getEmgNum() {
		return this.emgNum;
	}

	public void setEmgNum(Integer emgNum) {
		this.emgNum = emgNum;
	}

	public Integer getCmsDealedTotalNum() {
		return this.cmsDealedTotalNum;
	}

	public void setCmsDealedTotalNum(Integer cmsDealedTotalNum) {
		this.cmsDealedTotalNum = cmsDealedTotalNum;
	}

	public Integer getVulDealedTotalNum() {
		return this.vulDealedTotalNum;
	}

	public void setVulDealedTotalNum(Integer vulDealedTotalNum) {
		this.vulDealedTotalNum = vulDealedTotalNum;
	}

	public Integer getVulNntfSum() {
		return this.vulNntfSum;
	}

	public void setVulNntfSum(Integer vulNntfSum) {
		this.vulNntfSum = vulNntfSum;
	}

	public Integer getCmsNum() {
		return this.cmsNum;
	}

	public void setCmsNum(Integer cmsNum) {
		this.cmsNum = cmsNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getVulAsapSum() {
		return this.vulAsapSum;
	}

	public void setVulAsapSum(Integer vulAsapSum) {
		this.vulAsapSum = vulAsapSum;
	}

	public Integer getImageVulNntfSum() {
		return this.imageVulNntfSum;
	}

	public void setImageVulNntfSum(Integer imageVulNntfSum) {
		this.imageVulNntfSum = imageVulNntfSum;
	}

	public Integer getSysNum() {
		return this.sysNum;
	}

	public void setSysNum(Integer sysNum) {
		this.sysNum = sysNum;
	}

	public Integer getImageVulTotalSum() {
		return this.imageVulTotalSum;
	}

	public void setImageVulTotalSum(Integer imageVulTotalSum) {
		this.imageVulTotalSum = imageVulTotalSum;
	}

	@Override
	public DescribeVulNumStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulNumStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
