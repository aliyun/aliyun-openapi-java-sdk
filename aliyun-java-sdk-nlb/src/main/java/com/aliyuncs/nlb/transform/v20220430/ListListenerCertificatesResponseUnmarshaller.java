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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListListenerCertificatesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenerCertificatesResponseUnmarshaller {

	public static ListListenerCertificatesResponse unmarshall(ListListenerCertificatesResponse listListenerCertificatesResponse, UnmarshallerContext _ctx) {
		
		listListenerCertificatesResponse.setRequestId(_ctx.stringValue("ListListenerCertificatesResponse.RequestId"));
		listListenerCertificatesResponse.setSuccess(_ctx.booleanValue("ListListenerCertificatesResponse.Success"));
		listListenerCertificatesResponse.setCode(_ctx.stringValue("ListListenerCertificatesResponse.Code"));
		listListenerCertificatesResponse.setMessage(_ctx.stringValue("ListListenerCertificatesResponse.Message"));
		listListenerCertificatesResponse.setHttpStatusCode(_ctx.integerValue("ListListenerCertificatesResponse.HttpStatusCode"));
		listListenerCertificatesResponse.setDynamicCode(_ctx.stringValue("ListListenerCertificatesResponse.DynamicCode"));
		listListenerCertificatesResponse.setDynamicMessage(_ctx.stringValue("ListListenerCertificatesResponse.DynamicMessage"));
		listListenerCertificatesResponse.setTotalCount(_ctx.integerValue("ListListenerCertificatesResponse.TotalCount"));
		listListenerCertificatesResponse.setNextToken(_ctx.stringValue("ListListenerCertificatesResponse.NextToken"));
		listListenerCertificatesResponse.setMaxResults(_ctx.integerValue("ListListenerCertificatesResponse.MaxResults"));

		List<String> certificateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListListenerCertificatesResponse.CertificateIds.Length"); i++) {
			certificateIds.add(_ctx.stringValue("ListListenerCertificatesResponse.CertificateIds["+ i +"]"));
		}
		listListenerCertificatesResponse.setCertificateIds(certificateIds);
	 
	 	return listListenerCertificatesResponse;
	}
}