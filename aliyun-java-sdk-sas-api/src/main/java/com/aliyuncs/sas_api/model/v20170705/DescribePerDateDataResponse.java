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

package com.aliyuncs.sas_api.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas_api.transform.v20170705.DescribePerDateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePerDateDataResponse extends AcsResponse {

	private String requestId;

	private List<DataViewItem> dataView;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataViewItem> getDataView() {
		return this.dataView;
	}

	public void setDataView(List<DataViewItem> dataView) {
		this.dataView = dataView;
	}

	public static class DataViewItem {

		private String dataTime;

		private Long callTimes;

		private Long totalHit;

		private Long hitRate;

		private Long isGreyPhone;

		private Long isBlackPhone;

		private Long isVirtualOperator;

		private Long isOpenCommonPort1d;

		private Long isOpenCommonPort7d;

		private Long isOpenCommonPort30d;

		private Long isCheatFlow1d;

		private Long isCheatFlow7d;

		private Long isCheatFlow30d;

		private Long isProxy1d;

		private Long isProxy7d;

		private Long isProxy30d;

		private Long isHiJack1d;

		private Long isHiJack7d;

		private Long isHiJack30d;

		private Long isC21d;

		private Long isC27d;

		private Long isC230d;

		private Long isBotnet1d;

		private Long isBotnet7d;

		private Long isBotnet30d;

		private Long isNetAttack1d;

		private Long isNetAttack7d;

		private Long isNetAttack30d;

		private Long isBlackCampaign1d;

		private Long isBlackCampaign7d;

		private Long isBlackCampaign30d;

		public String getDataTime() {
			return this.dataTime;
		}

		public void setDataTime(String dataTime) {
			this.dataTime = dataTime;
		}

		public Long getCallTimes() {
			return this.callTimes;
		}

		public void setCallTimes(Long callTimes) {
			this.callTimes = callTimes;
		}

		public Long getTotalHit() {
			return this.totalHit;
		}

		public void setTotalHit(Long totalHit) {
			this.totalHit = totalHit;
		}

		public Long getHitRate() {
			return this.hitRate;
		}

		public void setHitRate(Long hitRate) {
			this.hitRate = hitRate;
		}

		public Long getIsGreyPhone() {
			return this.isGreyPhone;
		}

		public void setIsGreyPhone(Long isGreyPhone) {
			this.isGreyPhone = isGreyPhone;
		}

		public Long getIsBlackPhone() {
			return this.isBlackPhone;
		}

		public void setIsBlackPhone(Long isBlackPhone) {
			this.isBlackPhone = isBlackPhone;
		}

		public Long getIsVirtualOperator() {
			return this.isVirtualOperator;
		}

		public void setIsVirtualOperator(Long isVirtualOperator) {
			this.isVirtualOperator = isVirtualOperator;
		}

		public Long getIsOpenCommonPort1d() {
			return this.isOpenCommonPort1d;
		}

		public void setIsOpenCommonPort1d(Long isOpenCommonPort1d) {
			this.isOpenCommonPort1d = isOpenCommonPort1d;
		}

		public Long getIsOpenCommonPort7d() {
			return this.isOpenCommonPort7d;
		}

		public void setIsOpenCommonPort7d(Long isOpenCommonPort7d) {
			this.isOpenCommonPort7d = isOpenCommonPort7d;
		}

		public Long getIsOpenCommonPort30d() {
			return this.isOpenCommonPort30d;
		}

		public void setIsOpenCommonPort30d(Long isOpenCommonPort30d) {
			this.isOpenCommonPort30d = isOpenCommonPort30d;
		}

		public Long getIsCheatFlow1d() {
			return this.isCheatFlow1d;
		}

		public void setIsCheatFlow1d(Long isCheatFlow1d) {
			this.isCheatFlow1d = isCheatFlow1d;
		}

		public Long getIsCheatFlow7d() {
			return this.isCheatFlow7d;
		}

		public void setIsCheatFlow7d(Long isCheatFlow7d) {
			this.isCheatFlow7d = isCheatFlow7d;
		}

		public Long getIsCheatFlow30d() {
			return this.isCheatFlow30d;
		}

		public void setIsCheatFlow30d(Long isCheatFlow30d) {
			this.isCheatFlow30d = isCheatFlow30d;
		}

		public Long getIsProxy1d() {
			return this.isProxy1d;
		}

		public void setIsProxy1d(Long isProxy1d) {
			this.isProxy1d = isProxy1d;
		}

		public Long getIsProxy7d() {
			return this.isProxy7d;
		}

		public void setIsProxy7d(Long isProxy7d) {
			this.isProxy7d = isProxy7d;
		}

		public Long getIsProxy30d() {
			return this.isProxy30d;
		}

		public void setIsProxy30d(Long isProxy30d) {
			this.isProxy30d = isProxy30d;
		}

		public Long getIsHiJack1d() {
			return this.isHiJack1d;
		}

		public void setIsHiJack1d(Long isHiJack1d) {
			this.isHiJack1d = isHiJack1d;
		}

		public Long getIsHiJack7d() {
			return this.isHiJack7d;
		}

		public void setIsHiJack7d(Long isHiJack7d) {
			this.isHiJack7d = isHiJack7d;
		}

		public Long getIsHiJack30d() {
			return this.isHiJack30d;
		}

		public void setIsHiJack30d(Long isHiJack30d) {
			this.isHiJack30d = isHiJack30d;
		}

		public Long getIsC21d() {
			return this.isC21d;
		}

		public void setIsC21d(Long isC21d) {
			this.isC21d = isC21d;
		}

		public Long getIsC27d() {
			return this.isC27d;
		}

		public void setIsC27d(Long isC27d) {
			this.isC27d = isC27d;
		}

		public Long getIsC230d() {
			return this.isC230d;
		}

		public void setIsC230d(Long isC230d) {
			this.isC230d = isC230d;
		}

		public Long getIsBotnet1d() {
			return this.isBotnet1d;
		}

		public void setIsBotnet1d(Long isBotnet1d) {
			this.isBotnet1d = isBotnet1d;
		}

		public Long getIsBotnet7d() {
			return this.isBotnet7d;
		}

		public void setIsBotnet7d(Long isBotnet7d) {
			this.isBotnet7d = isBotnet7d;
		}

		public Long getIsBotnet30d() {
			return this.isBotnet30d;
		}

		public void setIsBotnet30d(Long isBotnet30d) {
			this.isBotnet30d = isBotnet30d;
		}

		public Long getIsNetAttack1d() {
			return this.isNetAttack1d;
		}

		public void setIsNetAttack1d(Long isNetAttack1d) {
			this.isNetAttack1d = isNetAttack1d;
		}

		public Long getIsNetAttack7d() {
			return this.isNetAttack7d;
		}

		public void setIsNetAttack7d(Long isNetAttack7d) {
			this.isNetAttack7d = isNetAttack7d;
		}

		public Long getIsNetAttack30d() {
			return this.isNetAttack30d;
		}

		public void setIsNetAttack30d(Long isNetAttack30d) {
			this.isNetAttack30d = isNetAttack30d;
		}

		public Long getIsBlackCampaign1d() {
			return this.isBlackCampaign1d;
		}

		public void setIsBlackCampaign1d(Long isBlackCampaign1d) {
			this.isBlackCampaign1d = isBlackCampaign1d;
		}

		public Long getIsBlackCampaign7d() {
			return this.isBlackCampaign7d;
		}

		public void setIsBlackCampaign7d(Long isBlackCampaign7d) {
			this.isBlackCampaign7d = isBlackCampaign7d;
		}

		public Long getIsBlackCampaign30d() {
			return this.isBlackCampaign30d;
		}

		public void setIsBlackCampaign30d(Long isBlackCampaign30d) {
			this.isBlackCampaign30d = isBlackCampaign30d;
		}
	}

	@Override
	public DescribePerDateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribePerDateDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
