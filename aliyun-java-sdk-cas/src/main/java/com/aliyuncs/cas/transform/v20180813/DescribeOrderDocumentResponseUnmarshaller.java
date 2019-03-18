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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeOrderDocumentResponse;
import com.aliyuncs.cas.model.v20180813.DescribeOrderDocumentResponse.OrderDocument;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderDocumentResponseUnmarshaller {

	public static DescribeOrderDocumentResponse unmarshall(DescribeOrderDocumentResponse describeOrderDocumentResponse, UnmarshallerContext context) {
		
		describeOrderDocumentResponse.setRequestId(context.stringValue("DescribeOrderDocumentResponse.RequestId"));

		List<OrderDocument> orderDocumentList = new ArrayList<OrderDocument>();
		for (int i = 0; i < context.lengthValue("DescribeOrderDocumentResponse.OrderDocumentList.Length"); i++) {
			OrderDocument orderDocument = new OrderDocument();
			orderDocument.setDocumentType(context.integerValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].DocumentType"));
			orderDocument.setTplDocNote(context.stringValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].TplDocNote"));
			orderDocument.setTplDocOssKey(context.stringValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].TplDocOssKey"));
			orderDocument.setOrderDocOssKey(context.stringValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].OrderDocOssKey"));
			orderDocument.setOrderDocDate(context.longValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].OrderDocDate"));
			orderDocument.setOrderDocExt(context.stringValue("DescribeOrderDocumentResponse.OrderDocumentList["+ i +"].OrderDocExt"));

			orderDocumentList.add(orderDocument);
		}
		describeOrderDocumentResponse.setOrderDocumentList(orderDocumentList);
	 
	 	return describeOrderDocumentResponse;
	}
}