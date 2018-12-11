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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeStaticVerificationListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStaticVerificationListResponse extends AcsResponse {

	private String requestId;

	private String replicaId;

	private String sourceInstanceId;

	private Integer sourceDBNumber;

	private Integer sourceTableNumber;

	private Integer sourceCountNumber;

	private Integer sourceDBSize;

	private String destinationInstanceId;

	private Integer destinationDBNumber;

	private Integer destinationTableNumber;

	private Integer destinationCountNumber;

	private Integer destinationDBSize;

	private String consistencyPercent;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
	}

	public Integer getSourceDBNumber() {
		return this.sourceDBNumber;
	}

	public void setSourceDBNumber(Integer sourceDBNumber) {
		this.sourceDBNumber = sourceDBNumber;
	}

	public Integer getSourceTableNumber() {
		return this.sourceTableNumber;
	}

	public void setSourceTableNumber(Integer sourceTableNumber) {
		this.sourceTableNumber = sourceTableNumber;
	}

	public Integer getSourceCountNumber() {
		return this.sourceCountNumber;
	}

	public void setSourceCountNumber(Integer sourceCountNumber) {
		this.sourceCountNumber = sourceCountNumber;
	}

	public Integer getSourceDBSize() {
		return this.sourceDBSize;
	}

	public void setSourceDBSize(Integer sourceDBSize) {
		this.sourceDBSize = sourceDBSize;
	}

	public String getDestinationInstanceId() {
		return this.destinationInstanceId;
	}

	public void setDestinationInstanceId(String destinationInstanceId) {
		this.destinationInstanceId = destinationInstanceId;
	}

	public Integer getDestinationDBNumber() {
		return this.destinationDBNumber;
	}

	public void setDestinationDBNumber(Integer destinationDBNumber) {
		this.destinationDBNumber = destinationDBNumber;
	}

	public Integer getDestinationTableNumber() {
		return this.destinationTableNumber;
	}

	public void setDestinationTableNumber(Integer destinationTableNumber) {
		this.destinationTableNumber = destinationTableNumber;
	}

	public Integer getDestinationCountNumber() {
		return this.destinationCountNumber;
	}

	public void setDestinationCountNumber(Integer destinationCountNumber) {
		this.destinationCountNumber = destinationCountNumber;
	}

	public Integer getDestinationDBSize() {
		return this.destinationDBSize;
	}

	public void setDestinationDBSize(Integer destinationDBSize) {
		this.destinationDBSize = destinationDBSize;
	}

	public String getConsistencyPercent() {
		return this.consistencyPercent;
	}

	public void setConsistencyPercent(String consistencyPercent) {
		this.consistencyPercent = consistencyPercent;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String abnormalType;

		private String sourceDetail;

		private String destinationDetail;

		public String getAbnormalType() {
			return this.abnormalType;
		}

		public void setAbnormalType(String abnormalType) {
			this.abnormalType = abnormalType;
		}

		public String getSourceDetail() {
			return this.sourceDetail;
		}

		public void setSourceDetail(String sourceDetail) {
			this.sourceDetail = sourceDetail;
		}

		public String getDestinationDetail() {
			return this.destinationDetail;
		}

		public void setDestinationDetail(String destinationDetail) {
			this.destinationDetail = destinationDetail;
		}
	}

	@Override
	public DescribeStaticVerificationListResponse getInstance(UnmarshallerContext context) {
		return	DescribeStaticVerificationListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
