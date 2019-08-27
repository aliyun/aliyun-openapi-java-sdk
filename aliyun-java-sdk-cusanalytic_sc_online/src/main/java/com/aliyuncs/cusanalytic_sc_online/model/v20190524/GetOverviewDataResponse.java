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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetOverviewDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOverviewDataResponse extends AcsResponse {

	private Float stayDeepAvg;

	private Float uvWeekGrowthPercent;

	private Float stayDeepAvgWeekGrowthPercent;

	private Long uv;

	private Float stayAvgPeriodWeekGrowthPercent;

	private Float uvEverySqm;

	private Float uvAvgWeekGrowthPercent;

	private Float stayAvgPeriod;

	private Float uvAvg;

	private Float uvEverySqmGrowthWeekPercent;

	public Float getStayDeepAvg() {
		return this.stayDeepAvg;
	}

	public void setStayDeepAvg(Float stayDeepAvg) {
		this.stayDeepAvg = stayDeepAvg;
	}

	public Float getUvWeekGrowthPercent() {
		return this.uvWeekGrowthPercent;
	}

	public void setUvWeekGrowthPercent(Float uvWeekGrowthPercent) {
		this.uvWeekGrowthPercent = uvWeekGrowthPercent;
	}

	public Float getStayDeepAvgWeekGrowthPercent() {
		return this.stayDeepAvgWeekGrowthPercent;
	}

	public void setStayDeepAvgWeekGrowthPercent(Float stayDeepAvgWeekGrowthPercent) {
		this.stayDeepAvgWeekGrowthPercent = stayDeepAvgWeekGrowthPercent;
	}

	public Long getUv() {
		return this.uv;
	}

	public void setUv(Long uv) {
		this.uv = uv;
	}

	public Float getStayAvgPeriodWeekGrowthPercent() {
		return this.stayAvgPeriodWeekGrowthPercent;
	}

	public void setStayAvgPeriodWeekGrowthPercent(Float stayAvgPeriodWeekGrowthPercent) {
		this.stayAvgPeriodWeekGrowthPercent = stayAvgPeriodWeekGrowthPercent;
	}

	public Float getUvEverySqm() {
		return this.uvEverySqm;
	}

	public void setUvEverySqm(Float uvEverySqm) {
		this.uvEverySqm = uvEverySqm;
	}

	public Float getUvAvgWeekGrowthPercent() {
		return this.uvAvgWeekGrowthPercent;
	}

	public void setUvAvgWeekGrowthPercent(Float uvAvgWeekGrowthPercent) {
		this.uvAvgWeekGrowthPercent = uvAvgWeekGrowthPercent;
	}

	public Float getStayAvgPeriod() {
		return this.stayAvgPeriod;
	}

	public void setStayAvgPeriod(Float stayAvgPeriod) {
		this.stayAvgPeriod = stayAvgPeriod;
	}

	public Float getUvAvg() {
		return this.uvAvg;
	}

	public void setUvAvg(Float uvAvg) {
		this.uvAvg = uvAvg;
	}

	public Float getUvEverySqmGrowthWeekPercent() {
		return this.uvEverySqmGrowthWeekPercent;
	}

	public void setUvEverySqmGrowthWeekPercent(Float uvEverySqmGrowthWeekPercent) {
		this.uvEverySqmGrowthWeekPercent = uvEverySqmGrowthWeekPercent;
	}

	@Override
	public GetOverviewDataResponse getInstance(UnmarshallerContext context) {
		return	GetOverviewDataResponseUnmarshaller.unmarshall(this, context);
	}
}
