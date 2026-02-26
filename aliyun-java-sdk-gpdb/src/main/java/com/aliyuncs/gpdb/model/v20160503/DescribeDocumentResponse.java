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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDocumentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDocumentResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String status;

	private String fileName;

	private String fileExt;

	private Integer fileVersion;

	private String fileMtime;

	private String source;

	private String documentLoader;

	private String textSplitter;

	private Long fileSize;

	private String fileMd5;

	private Integer docsCount;

	private String fileUrl;

	private String plainChunkFileUrl;

	private String chunkFileUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExt() {
		return this.fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public Integer getFileVersion() {
		return this.fileVersion;
	}

	public void setFileVersion(Integer fileVersion) {
		this.fileVersion = fileVersion;
	}

	public String getFileMtime() {
		return this.fileMtime;
	}

	public void setFileMtime(String fileMtime) {
		this.fileMtime = fileMtime;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDocumentLoader() {
		return this.documentLoader;
	}

	public void setDocumentLoader(String documentLoader) {
		this.documentLoader = documentLoader;
	}

	public String getTextSplitter() {
		return this.textSplitter;
	}

	public void setTextSplitter(String textSplitter) {
		this.textSplitter = textSplitter;
	}

	public Long getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileMd5() {
		return this.fileMd5;
	}

	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public Integer getDocsCount() {
		return this.docsCount;
	}

	public void setDocsCount(Integer docsCount) {
		this.docsCount = docsCount;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getPlainChunkFileUrl() {
		return this.plainChunkFileUrl;
	}

	public void setPlainChunkFileUrl(String plainChunkFileUrl) {
		this.plainChunkFileUrl = plainChunkFileUrl;
	}

	public String getChunkFileUrl() {
		return this.chunkFileUrl;
	}

	public void setChunkFileUrl(String chunkFileUrl) {
		this.chunkFileUrl = chunkFileUrl;
	}

	@Override
	public DescribeDocumentResponse getInstance(UnmarshallerContext context) {
		return	DescribeDocumentResponseUnmarshaller.unmarshall(this, context);
	}
}
