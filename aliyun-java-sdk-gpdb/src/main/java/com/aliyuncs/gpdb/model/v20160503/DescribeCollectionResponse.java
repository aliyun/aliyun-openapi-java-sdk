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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeCollectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCollectionResponse extends AcsResponse {

	private String status;

	private String message;

	private String requestId;

	private Map<Object,Object> metadata;

	private String sparseVectorMetrics;

	private Integer dimension;

	private String fullTextRetrievalFields;

	private String namespace;

	private String parser;

	private String metrics;

	private String dBInstanceId;

	private Boolean supportSparse;

	private String regionId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Map<Object,Object> metadata) {
		this.metadata = metadata;
	}

	public String getSparseVectorMetrics() {
		return this.sparseVectorMetrics;
	}

	public void setSparseVectorMetrics(String sparseVectorMetrics) {
		this.sparseVectorMetrics = sparseVectorMetrics;
	}

	public Integer getDimension() {
		return this.dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
	}

	public String getFullTextRetrievalFields() {
		return this.fullTextRetrievalFields;
	}

	public void setFullTextRetrievalFields(String fullTextRetrievalFields) {
		this.fullTextRetrievalFields = fullTextRetrievalFields;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getParser() {
		return this.parser;
	}

	public void setParser(String parser) {
		this.parser = parser;
	}

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public Boolean getSupportSparse() {
		return this.supportSparse;
	}

	public void setSupportSparse(Boolean supportSparse) {
		this.supportSparse = supportSparse;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	@Override
	public DescribeCollectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeCollectionResponseUnmarshaller.unmarshall(this, context);
	}
}
