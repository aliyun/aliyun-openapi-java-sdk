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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeDocumentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDocumentResponseUnmarshaller {

	public static DescribeDocumentResponse unmarshall(DescribeDocumentResponse describeDocumentResponse, UnmarshallerContext _ctx) {
		
		describeDocumentResponse.setRequestId(_ctx.stringValue("DescribeDocumentResponse.RequestId"));
		describeDocumentResponse.setMessage(_ctx.stringValue("DescribeDocumentResponse.Message"));
		describeDocumentResponse.setStatus(_ctx.stringValue("DescribeDocumentResponse.Status"));
		describeDocumentResponse.setFileName(_ctx.stringValue("DescribeDocumentResponse.FileName"));
		describeDocumentResponse.setFileExt(_ctx.stringValue("DescribeDocumentResponse.FileExt"));
		describeDocumentResponse.setFileVersion(_ctx.integerValue("DescribeDocumentResponse.FileVersion"));
		describeDocumentResponse.setFileMtime(_ctx.stringValue("DescribeDocumentResponse.FileMtime"));
		describeDocumentResponse.setSource(_ctx.stringValue("DescribeDocumentResponse.Source"));
		describeDocumentResponse.setDocumentLoader(_ctx.stringValue("DescribeDocumentResponse.DocumentLoader"));
		describeDocumentResponse.setTextSplitter(_ctx.stringValue("DescribeDocumentResponse.TextSplitter"));
		describeDocumentResponse.setFileSize(_ctx.longValue("DescribeDocumentResponse.FileSize"));
		describeDocumentResponse.setFileMd5(_ctx.stringValue("DescribeDocumentResponse.FileMd5"));
		describeDocumentResponse.setDocsCount(_ctx.integerValue("DescribeDocumentResponse.DocsCount"));
		describeDocumentResponse.setFileUrl(_ctx.stringValue("DescribeDocumentResponse.FileUrl"));
		describeDocumentResponse.setPlainChunkFileUrl(_ctx.stringValue("DescribeDocumentResponse.PlainChunkFileUrl"));
		describeDocumentResponse.setChunkFileUrl(_ctx.stringValue("DescribeDocumentResponse.ChunkFileUrl"));
	 
	 	return describeDocumentResponse;
	}
}