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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopUrlVisitResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopUrlVisitResponse.UrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeDcdnDomainTopUrlVisitResponse unmarshall(DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisitResponse, UnmarshallerContext context) {
		
		describeDcdnDomainTopUrlVisitResponse.setRequestId(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.RequestId"));
		describeDcdnDomainTopUrlVisitResponse.setDomainName(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.DomainName"));
		describeDcdnDomainTopUrlVisitResponse.setStartTime(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDcdnDomainTopUrlVisitResponse;
	}
}