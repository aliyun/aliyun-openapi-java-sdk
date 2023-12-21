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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetABMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetABMetricResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String description;

	private String sceneId;

	private String sceneName;

	private String type;

	private String realtime;

	private String tableMetaId;

	private String resultTableMetaId;

	private String resultResourceId;

	private String definition;

	private Integer statisticsCycle;

	private String leftMetricId;

	private String rightMetricId;

	private String operator;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneName() {
		return this.sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRealtime() {
		return this.realtime;
	}

	public void setRealtime(String realtime) {
		this.realtime = realtime;
	}

	public String getTableMetaId() {
		return this.tableMetaId;
	}

	public void setTableMetaId(String tableMetaId) {
		this.tableMetaId = tableMetaId;
	}

	public String getResultTableMetaId() {
		return this.resultTableMetaId;
	}

	public void setResultTableMetaId(String resultTableMetaId) {
		this.resultTableMetaId = resultTableMetaId;
	}

	public String getResultResourceId() {
		return this.resultResourceId;
	}

	public void setResultResourceId(String resultResourceId) {
		this.resultResourceId = resultResourceId;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Integer getStatisticsCycle() {
		return this.statisticsCycle;
	}

	public void setStatisticsCycle(Integer statisticsCycle) {
		this.statisticsCycle = statisticsCycle;
	}

	public String getLeftMetricId() {
		return this.leftMetricId;
	}

	public void setLeftMetricId(String leftMetricId) {
		this.leftMetricId = leftMetricId;
	}

	public String getRightMetricId() {
		return this.rightMetricId;
	}

	public void setRightMetricId(String rightMetricId) {
		this.rightMetricId = rightMetricId;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public GetABMetricResponse getInstance(UnmarshallerContext context) {
		return	GetABMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
