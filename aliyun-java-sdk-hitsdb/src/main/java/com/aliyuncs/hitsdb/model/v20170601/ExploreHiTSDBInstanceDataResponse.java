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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.ExploreHiTSDBInstanceDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExploreHiTSDBInstanceDataResponse extends AcsResponse {

	private String requestId;

	private String start;

	private String end;

	private String metric;

	private List<TimeLine> timeLines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public List<TimeLine> getTimeLines() {
		return this.timeLines;
	}

	public void setTimeLines(List<TimeLine> timeLines) {
		this.timeLines = timeLines;
	}

	public static class TimeLine {

		private List<Tag> tags;

		private List<Point> series;

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Point> getSeries() {
			return this.series;
		}

		public void setSeries(List<Point> series) {
			this.series = series;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class Point {

			private String timestamp;

			private Float value;

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}
	}

	@Override
	public ExploreHiTSDBInstanceDataResponse getInstance(UnmarshallerContext context) {
		return	ExploreHiTSDBInstanceDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
