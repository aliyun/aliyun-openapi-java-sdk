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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListEnvironmentMetricTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentMetricTargetsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ActiveTargetsItem> activeTargets;

		private List<DroppedTargetsItem> droppedTargets;

		public List<ActiveTargetsItem> getActiveTargets() {
			return this.activeTargets;
		}

		public void setActiveTargets(List<ActiveTargetsItem> activeTargets) {
			this.activeTargets = activeTargets;
		}

		public List<DroppedTargetsItem> getDroppedTargets() {
			return this.droppedTargets;
		}

		public void setDroppedTargets(List<DroppedTargetsItem> droppedTargets) {
			this.droppedTargets = droppedTargets;
		}

		public static class ActiveTargetsItem {

			private Map<Object,Object> discoveredLabels;

			private String globalUrl;

			private String health;

			private Map<Object,Object> labels;

			private String lastError;

			private String lastScrape;

			private Double lastScrapeDuration;

			private Long lastScrapeSeries;

			private String scrapePool;

			private String scrapeUrl;

			public Map<Object,Object> getDiscoveredLabels() {
				return this.discoveredLabels;
			}

			public void setDiscoveredLabels(Map<Object,Object> discoveredLabels) {
				this.discoveredLabels = discoveredLabels;
			}

			public String getGlobalUrl() {
				return this.globalUrl;
			}

			public void setGlobalUrl(String globalUrl) {
				this.globalUrl = globalUrl;
			}

			public String getHealth() {
				return this.health;
			}

			public void setHealth(String health) {
				this.health = health;
			}

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
			}

			public String getLastError() {
				return this.lastError;
			}

			public void setLastError(String lastError) {
				this.lastError = lastError;
			}

			public String getLastScrape() {
				return this.lastScrape;
			}

			public void setLastScrape(String lastScrape) {
				this.lastScrape = lastScrape;
			}

			public Double getLastScrapeDuration() {
				return this.lastScrapeDuration;
			}

			public void setLastScrapeDuration(Double lastScrapeDuration) {
				this.lastScrapeDuration = lastScrapeDuration;
			}

			public Long getLastScrapeSeries() {
				return this.lastScrapeSeries;
			}

			public void setLastScrapeSeries(Long lastScrapeSeries) {
				this.lastScrapeSeries = lastScrapeSeries;
			}

			public String getScrapePool() {
				return this.scrapePool;
			}

			public void setScrapePool(String scrapePool) {
				this.scrapePool = scrapePool;
			}

			public String getScrapeUrl() {
				return this.scrapeUrl;
			}

			public void setScrapeUrl(String scrapeUrl) {
				this.scrapeUrl = scrapeUrl;
			}
		}

		public static class DroppedTargetsItem {

			private Map<Object,Object> discoveredLabels;

			private String globalUrl;

			private String health;

			private Map<Object,Object> labels;

			private String lastError;

			private String lastScrape;

			private Double lastScrapeDuration;

			private Long lastScrapeSeries;

			private String scrapePool;

			private String scrapeUrl;

			public Map<Object,Object> getDiscoveredLabels() {
				return this.discoveredLabels;
			}

			public void setDiscoveredLabels(Map<Object,Object> discoveredLabels) {
				this.discoveredLabels = discoveredLabels;
			}

			public String getGlobalUrl() {
				return this.globalUrl;
			}

			public void setGlobalUrl(String globalUrl) {
				this.globalUrl = globalUrl;
			}

			public String getHealth() {
				return this.health;
			}

			public void setHealth(String health) {
				this.health = health;
			}

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
			}

			public String getLastError() {
				return this.lastError;
			}

			public void setLastError(String lastError) {
				this.lastError = lastError;
			}

			public String getLastScrape() {
				return this.lastScrape;
			}

			public void setLastScrape(String lastScrape) {
				this.lastScrape = lastScrape;
			}

			public Double getLastScrapeDuration() {
				return this.lastScrapeDuration;
			}

			public void setLastScrapeDuration(Double lastScrapeDuration) {
				this.lastScrapeDuration = lastScrapeDuration;
			}

			public Long getLastScrapeSeries() {
				return this.lastScrapeSeries;
			}

			public void setLastScrapeSeries(Long lastScrapeSeries) {
				this.lastScrapeSeries = lastScrapeSeries;
			}

			public String getScrapePool() {
				return this.scrapePool;
			}

			public void setScrapePool(String scrapePool) {
				this.scrapePool = scrapePool;
			}

			public String getScrapeUrl() {
				return this.scrapeUrl;
			}

			public void setScrapeUrl(String scrapeUrl) {
				this.scrapeUrl = scrapeUrl;
			}
		}
	}

	@Override
	public ListEnvironmentMetricTargetsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvironmentMetricTargetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
