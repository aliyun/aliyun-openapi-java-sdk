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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeDefenceThreadResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDefenceThreadResponse extends AcsResponse {

	private String requestId;

	private Integer defenceCountTotal;

	private Integer tamperProofTotal;

	private List<String> defenceAaggregatCountArray;

	private List<String> tamperProofArray;

	private List<String> dateArray;

	private List<String> tamperProofAaggregateArray;

	private List<String> defenceCountArray;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDefenceCountTotal() {
		return this.defenceCountTotal;
	}

	public void setDefenceCountTotal(Integer defenceCountTotal) {
		this.defenceCountTotal = defenceCountTotal;
	}

	public Integer getTamperProofTotal() {
		return this.tamperProofTotal;
	}

	public void setTamperProofTotal(Integer tamperProofTotal) {
		this.tamperProofTotal = tamperProofTotal;
	}

	public List<String> getDefenceAaggregatCountArray() {
		return this.defenceAaggregatCountArray;
	}

	public void setDefenceAaggregatCountArray(List<String> defenceAaggregatCountArray) {
		this.defenceAaggregatCountArray = defenceAaggregatCountArray;
	}

	public List<String> getTamperProofArray() {
		return this.tamperProofArray;
	}

	public void setTamperProofArray(List<String> tamperProofArray) {
		this.tamperProofArray = tamperProofArray;
	}

	public List<String> getDateArray() {
		return this.dateArray;
	}

	public void setDateArray(List<String> dateArray) {
		this.dateArray = dateArray;
	}

	public List<String> getTamperProofAaggregateArray() {
		return this.tamperProofAaggregateArray;
	}

	public void setTamperProofAaggregateArray(List<String> tamperProofAaggregateArray) {
		this.tamperProofAaggregateArray = tamperProofAaggregateArray;
	}

	public List<String> getDefenceCountArray() {
		return this.defenceCountArray;
	}

	public void setDefenceCountArray(List<String> defenceCountArray) {
		this.defenceCountArray = defenceCountArray;
	}

	@Override
	public DescribeDefenceThreadResponse getInstance(UnmarshallerContext context) {
		return	DescribeDefenceThreadResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
