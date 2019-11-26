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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeCustomLinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomLinesResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalPages;

	private List<CustomLine> customLines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<CustomLine> getCustomLines() {
		return this.customLines;
	}

	public void setCustomLines(List<CustomLine> customLines) {
		this.customLines = customLines;
	}

	public static class CustomLine {

		private Long id;

		private String name;

		private String createTime;

		private Long createTimestamp;

		private String ipSegments;

		private String code;

		private List<IpSegment> ipSegmentList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getIpSegments() {
			return this.ipSegments;
		}

		public void setIpSegments(String ipSegments) {
			this.ipSegments = ipSegments;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public List<IpSegment> getIpSegmentList() {
			return this.ipSegmentList;
		}

		public void setIpSegmentList(List<IpSegment> ipSegmentList) {
			this.ipSegmentList = ipSegmentList;
		}

		public static class IpSegment {

			private String name;

			private String startIp;

			private String endIp;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStartIp() {
				return this.startIp;
			}

			public void setStartIp(String startIp) {
				this.startIp = startIp;
			}

			public String getEndIp() {
				return this.endIp;
			}

			public void setEndIp(String endIp) {
				this.endIp = endIp;
			}
		}
	}

	@Override
	public DescribeCustomLinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomLinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
