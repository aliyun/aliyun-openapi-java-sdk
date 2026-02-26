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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribePreloadDetailByIdResponse;
import com.aliyuncs.cdn.model.v20180510.DescribePreloadDetailByIdResponse.UrlDetail;
import com.aliyuncs.cdn.model.v20180510.DescribePreloadDetailByIdResponse.UrlDetail.Url;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePreloadDetailByIdResponseUnmarshaller {

	public static DescribePreloadDetailByIdResponse unmarshall(DescribePreloadDetailByIdResponse describePreloadDetailByIdResponse, UnmarshallerContext _ctx) {
		
		describePreloadDetailByIdResponse.setRequestId(_ctx.stringValue("DescribePreloadDetailByIdResponse.RequestId"));
		describePreloadDetailByIdResponse.setTotalCount(_ctx.longValue("DescribePreloadDetailByIdResponse.TotalCount"));

		List<UrlDetail> urlDetails = new ArrayList<UrlDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreloadDetailByIdResponse.UrlDetails.Length"); i++) {
			UrlDetail urlDetail = new UrlDetail();
			urlDetail.setTaskId(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].TaskId"));
			urlDetail.setDomain(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Domain"));
			urlDetail.setCreationTime(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].CreationTime"));
			urlDetail.setEndTime(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].EndTime"));
			urlDetail.setRetCode(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].RetCode"));
			urlDetail.setProcess(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Process"));
			urlDetail.setStatus(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Status"));

			List<Url> urls = new ArrayList<Url>();
			for (int j = 0; j < _ctx.lengthValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Urls.Length"); j++) {
				Url url = new Url();
				url.setUrl(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Urls["+ j +"].Url"));
				url.setSuccess(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Urls["+ j +"].Success"));
				url.setDescription(_ctx.stringValue("DescribePreloadDetailByIdResponse.UrlDetails["+ i +"].Urls["+ j +"].Description"));

				urls.add(url);
			}
			urlDetail.setUrls(urls);

			urlDetails.add(urlDetail);
		}
		describePreloadDetailByIdResponse.setUrlDetails(urlDetails);
	 
	 	return describePreloadDetailByIdResponse;
	}
}