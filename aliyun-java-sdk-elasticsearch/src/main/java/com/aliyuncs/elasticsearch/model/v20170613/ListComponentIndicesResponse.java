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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListComponentIndicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListComponentIndicesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class ResultItem {

		private String name;

		private List<String> composed;

		private Content content;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getComposed() {
			return this.composed;
		}

		public void setComposed(List<String> composed) {
			this.composed = composed;
		}

		public Content getContent() {
			return this.content;
		}

		public void setContent(Content content) {
			this.content = content;
		}

		public static class Content {

			private Long version;

			private Map<Object,Object> _meta;

			private Template template;

			public Long getVersion() {
				return this.version;
			}

			public void setVersion(Long version) {
				this.version = version;
			}

			public Map<Object,Object> get_Meta() {
				return this._meta;
			}

			public void set_Meta(Map<Object,Object> _meta) {
				this._meta = _meta;
			}

			public Template getTemplate() {
				return this.template;
			}

			public void setTemplate(Template template) {
				this.template = template;
			}

			public static class Template {

				private Settings settings;

				public Settings getSettings() {
					return this.settings;
				}

				public void setSettings(Settings settings) {
					this.settings = settings;
				}

				public static class Settings {

					private Index index;

					public Index getIndex() {
						return this.index;
					}

					public void setIndex(Index index) {
						this.index = index;
					}

					public static class Index {

						private String codec;

						private Lifecycle lifecycle;

						public String getCodec() {
							return this.codec;
						}

						public void setCodec(String codec) {
							this.codec = codec;
						}

						public Lifecycle getLifecycle() {
							return this.lifecycle;
						}

						public void setLifecycle(Lifecycle lifecycle) {
							this.lifecycle = lifecycle;
						}

						public static class Lifecycle {

							private String name;

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}
						}
					}
				}
			}
		}
	}

	public static class Headers {

		private Long xTotalCount;

		public Long getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Long xTotalCount) {
			this.xTotalCount = xTotalCount;
		}
	}

	@Override
	public ListComponentIndicesResponse getInstance(UnmarshallerContext context) {
		return	ListComponentIndicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
