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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeTotalStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTotalStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer vulAsapSum;

	private Integer vulNntfSum;

	private Integer healthTotal;

	private Integer suspiciousmediumTotal;

	private Integer health;

	private Integer healthdealedTotal;

	private Integer trojan;

	private Integer vulLaterSum;

	private Integer suspicious;

	private Integer vul;

	private Integer healthhighTotal;

	private Integer healthlowTotal;

	private Integer healthseriousTotal;

	private Integer vulDealedTotal;

	private Integer patch;

	private Integer suspicioushighTotal;

	private Integer suspiciouslowTotal;

	private Integer suspiciousTotal;

	private Integer vulTotal;

	private Integer suspiciousseriousTotal;

	private Integer healthmediumTotal;

	private Boolean online;

	private Integer suspiciousdealedTotal;

	private Integer account;

	private Integer newsuspicious;

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

	public Integer getVulNntfSum() {
		return this.vulNntfSum;
	}

	public void setVulNntfSum(Integer vulNntfSum) {
		this.vulNntfSum = vulNntfSum;
	}

	public Integer getHealthTotal() {
		return this.healthTotal;
	}

	public void setHealthTotal(Integer healthTotal) {
		this.healthTotal = healthTotal;
	}

	public Integer getSuspiciousmediumTotal() {
		return this.suspiciousmediumTotal;
	}

	public void setSuspiciousmediumTotal(Integer suspiciousmediumTotal) {
		this.suspiciousmediumTotal = suspiciousmediumTotal;
	}

	public Integer getHealth() {
		return this.health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getHealthdealedTotal() {
		return this.healthdealedTotal;
	}

	public void setHealthdealedTotal(Integer healthdealedTotal) {
		this.healthdealedTotal = healthdealedTotal;
	}

	public Integer getTrojan() {
		return this.trojan;
	}

	public void setTrojan(Integer trojan) {
		this.trojan = trojan;
	}

	public Integer getVulLaterSum() {
		return this.vulLaterSum;
	}

	public void setVulLaterSum(Integer vulLaterSum) {
		this.vulLaterSum = vulLaterSum;
	}

	public Integer getSuspicious() {
		return this.suspicious;
	}

	public void setSuspicious(Integer suspicious) {
		this.suspicious = suspicious;
	}

	public Integer getVul() {
		return this.vul;
	}

	public void setVul(Integer vul) {
		this.vul = vul;
	}

	public Integer getHealthhighTotal() {
		return this.healthhighTotal;
	}

	public void setHealthhighTotal(Integer healthhighTotal) {
		this.healthhighTotal = healthhighTotal;
	}

	public Integer getHealthlowTotal() {
		return this.healthlowTotal;
	}

	public void setHealthlowTotal(Integer healthlowTotal) {
		this.healthlowTotal = healthlowTotal;
	}

	public Integer getHealthseriousTotal() {
		return this.healthseriousTotal;
	}

	public void setHealthseriousTotal(Integer healthseriousTotal) {
		this.healthseriousTotal = healthseriousTotal;
	}

	public Integer getVulDealedTotal() {
		return this.vulDealedTotal;
	}

	public void setVulDealedTotal(Integer vulDealedTotal) {
		this.vulDealedTotal = vulDealedTotal;
	}

	public Integer getPatch() {
		return this.patch;
	}

	public void setPatch(Integer patch) {
		this.patch = patch;
	}

	public Integer getSuspicioushighTotal() {
		return this.suspicioushighTotal;
	}

	public void setSuspicioushighTotal(Integer suspicioushighTotal) {
		this.suspicioushighTotal = suspicioushighTotal;
	}

	public Integer getSuspiciouslowTotal() {
		return this.suspiciouslowTotal;
	}

	public void setSuspiciouslowTotal(Integer suspiciouslowTotal) {
		this.suspiciouslowTotal = suspiciouslowTotal;
	}

	public Integer getSuspiciousTotal() {
		return this.suspiciousTotal;
	}

	public void setSuspiciousTotal(Integer suspiciousTotal) {
		this.suspiciousTotal = suspiciousTotal;
	}

	public Integer getVulTotal() {
		return this.vulTotal;
	}

	public void setVulTotal(Integer vulTotal) {
		this.vulTotal = vulTotal;
	}

	public Integer getSuspiciousseriousTotal() {
		return this.suspiciousseriousTotal;
	}

	public void setSuspiciousseriousTotal(Integer suspiciousseriousTotal) {
		this.suspiciousseriousTotal = suspiciousseriousTotal;
	}

	public Integer getHealthmediumTotal() {
		return this.healthmediumTotal;
	}

	public void setHealthmediumTotal(Integer healthmediumTotal) {
		this.healthmediumTotal = healthmediumTotal;
	}

	public Boolean getOnline() {
		return this.online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public Integer getSuspiciousdealedTotal() {
		return this.suspiciousdealedTotal;
	}

	public void setSuspiciousdealedTotal(Integer suspiciousdealedTotal) {
		this.suspiciousdealedTotal = suspiciousdealedTotal;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getNewsuspicious() {
		return this.newsuspicious;
	}

	public void setNewsuspicious(Integer newsuspicious) {
		this.newsuspicious = newsuspicious;
	}

	@Override
	public DescribeTotalStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTotalStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
