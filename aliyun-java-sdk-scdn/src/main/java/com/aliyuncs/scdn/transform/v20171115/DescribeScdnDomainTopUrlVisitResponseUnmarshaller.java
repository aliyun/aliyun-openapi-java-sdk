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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeScdnDomainTopUrlVisitResponse unmarshall(DescribeScdnDomainTopUrlVisitResponse describeScdnDomainTopUrlVisitResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainTopUrlVisitResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.RequestId"));
		describeScdnDomainTopUrlVisitResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.DomainName"));
		describeScdnDomainTopUrlVisitResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeScdnDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList1 = new UrlList();
			urlList1.setUrlDetail(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList1.setVisitData(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList1.setVisitProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList1.setFlow(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList1.setFlowProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList1);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList2 = new UrlList();
			urlList2.setUrlDetail(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList2.setVisitData(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList2.setVisitProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList2.setFlow(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList2.setFlowProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList2);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList3 = new UrlList();
			urlList3.setUrlDetail(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList3.setVisitData(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList3.setVisitProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList3.setFlow(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList3.setFlowProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList3);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList4 = new UrlList();
			urlList4.setUrlDetail(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList4.setVisitData(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList4.setVisitProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList4.setFlow(_ctx.stringValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList4.setFlowProportion(_ctx.floatValue("DescribeScdnDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList4);
		}
		describeScdnDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeScdnDomainTopUrlVisitResponse;
	}
}