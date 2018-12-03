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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTopUrlVisitResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTopUrlVisitResponse.UrlList;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeScdnDomainTopUrlVisitResponse unmarshall(DescribeScdnDomainTopUrlVisitResponse describeScdnDomainTopUrlVisitResponse, UnmarshallerContext context) {
		
		describeScdnDomainTopUrlVisitResponse.setRequestId(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.RequestId"));
		describeScdnDomainTopUrlVisitResponse.setDomainName(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.DomainName"));
		describeScdnDomainTopUrlVisitResponse.setStartTime(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeScdnDomainTopUrlVisitResponse;
	}
}