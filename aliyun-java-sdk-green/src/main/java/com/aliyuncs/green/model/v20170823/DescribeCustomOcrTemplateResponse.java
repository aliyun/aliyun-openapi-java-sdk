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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeCustomOcrTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomOcrTemplateResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<OcrTemplate> ocrTemplateList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<OcrTemplate> getOcrTemplateList() {
		return this.ocrTemplateList;
	}

	public void setOcrTemplateList(List<OcrTemplate> ocrTemplateList) {
		this.ocrTemplateList = ocrTemplateList;
	}

	public static class OcrTemplate {

		private Long id;

		private String name;

		private String imgUrl;

		private Integer status;

		private List<Item> referArea;

		private List<Item> recognizeArea;

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

		public String getImgUrl() {
			return this.imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<Item> getReferArea() {
			return this.referArea;
		}

		public void setReferArea(List<Item> referArea) {
			this.referArea = referArea;
		}

		public List<Item> getRecognizeArea() {
			return this.recognizeArea;
		}

		public void setRecognizeArea(List<Item> recognizeArea) {
			this.recognizeArea = recognizeArea;
		}

		public static class Item {

			private String name;

			private Integer x;

			private Integer y;

			private Integer width;

			private Integer height;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getX() {
				return this.x;
			}

			public void setX(Integer x) {
				this.x = x;
			}

			public Integer getY() {
				return this.y;
			}

			public void setY(Integer y) {
				this.y = y;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}
		}
	}

	@Override
	public DescribeCustomOcrTemplateResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomOcrTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
