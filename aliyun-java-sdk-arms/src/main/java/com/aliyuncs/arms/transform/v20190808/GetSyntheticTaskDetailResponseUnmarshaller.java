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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Download;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.MinotorListItem;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Nav;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Net;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Formdata;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Urlencoded;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.HeaderItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSyntheticTaskDetailResponseUnmarshaller {

	public static GetSyntheticTaskDetailResponse unmarshall(GetSyntheticTaskDetailResponse getSyntheticTaskDetailResponse, UnmarshallerContext _ctx) {
		
		getSyntheticTaskDetailResponse.setRequestId(_ctx.stringValue("GetSyntheticTaskDetailResponse.RequestId"));

		TaskDetail taskDetail = new TaskDetail();
		taskDetail.setTaskId(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.TaskId"));
		taskDetail.setTaskName(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.TaskName"));
		taskDetail.setUrl(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Url"));
		taskDetail.setTaskType(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.TaskType"));
		taskDetail.setIntervalTime(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.IntervalTime"));
		taskDetail.setIntervalType(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.IntervalType"));
		taskDetail.setIpType(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.IpType"));

		ExtendInterval extendInterval = new ExtendInterval();
		extendInterval.setStartTime(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.StartTime"));
		extendInterval.setEndTime(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.EndTime"));
		extendInterval.setStartHour(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.StartHour"));
		extendInterval.setStartMinute(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.StartMinute"));
		extendInterval.setEndhour(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.Endhour"));
		extendInterval.setEndMinute(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.EndMinute"));

		List<Long> days = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.Days.Length"); i++) {
			days.add(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.ExtendInterval.Days["+ i +"]"));
		}
		extendInterval.setDays(days);
		taskDetail.setExtendInterval(extendInterval);

		Download download = new Download();
		download.setDownloadTransmissionSize(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadTransmissionSize"));
		download.setDownloadCustomHost(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadCustomHost"));
		download.setDownloadCustomHostIp(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadCustomHostIp"));
		download.setWhiteList(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.WhiteList"));
		download.setDownloadKernel(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadKernel"));
		download.setQuickProtocol(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.QuickProtocol"));
		download.setMonitorTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.MonitorTimeout"));
		download.setConnectionTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.ConnectionTimeout"));
		download.setVerifyWay(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.VerifyWay"));
		download.setValidateKeywords(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.ValidateKeywords"));
		download.setDownloadRedirect(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadRedirect"));
		download.setDownloadCustomHeaderContent(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Download.DownloadCustomHeaderContent"));
		taskDetail.setDownload(download);

		Net net = new Net();
		net.setNetIcmpSwitch(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpSwitch"));
		net.setNetIcmpActive(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpActive"));
		net.setNetIcmpTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpTimeout"));
		net.setNetIcmpInterval(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpInterval"));
		net.setNetIcmpNum(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpNum"));
		net.setNetIcmpSize(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpSize"));
		net.setNetIcmpDataCut(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetIcmpDataCut"));
		net.setNetDnsQueryMethod(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetDnsQueryMethod"));
		net.setNetDnsSwitch(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetDnsSwitch"));
		net.setNetTraceRouteSwitch(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetTraceRouteSwitch"));
		net.setNetTraceRouteTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetTraceRouteTimeout"));
		net.setNetTraceRouteNum(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetTraceRouteNum"));
		net.setWhiteList(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.WhiteList"));
		net.setNetDnsNs(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetDnsNs"));
		net.setNetDigSwitch(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetDigSwitch"));
		net.setNetDnsServer(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Net.NetDnsServer"));
		taskDetail.setNet(net);

		Nav nav = new Nav();
		nav.setNavDisableCache(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavDisableCache"));
		nav.setNavReturnElement(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavReturnElement"));
		nav.setNavRedirect(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavRedirect"));
		nav.setNavDisableCompression(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavDisableCompression"));
		nav.setNavAutomaticScrolling(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavAutomaticScrolling"));
		nav.setNavIgnoreCertificateError(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavIgnoreCertificateError"));
		nav.setFilterInvalidIP(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.FilterInvalidIP"));
		nav.setExecuteApplet(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.ExecuteApplet"));
		nav.setExecuteActiveX(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.ExecuteActiveX"));
		nav.setExecuteScript(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.ExecuteScript"));
		nav.setQuicVersion(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.QuicVersion"));
		nav.setQuicDomain(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.QuicDomain"));
		nav.setRequestHeader(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.RequestHeader"));
		nav.setNavCustomHost(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavCustomHost"));
		nav.setNavCustomHostIp(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavCustomHostIp"));
		nav.setNavCustomHeader(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavCustomHeader"));
		nav.setNavCustomHeaderContent(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.NavCustomHeaderContent"));
		nav.setElementBlacklist(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.ElementBlacklist"));
		nav.setProcessName(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.ProcessName"));
		nav.setVerifyStringBlacklist(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.VerifyStringBlacklist"));
		nav.setVerifyStringWhitelist(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.VerifyStringWhitelist"));
		nav.setMonitorTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.MonitorTimeout"));
		nav.setWaitCompletionTime(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.WaitCompletionTime"));
		nav.setSlowElementThreshold(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.SlowElementThreshold"));
		nav.setDnsHijackWhitelist(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.DnsHijackWhitelist"));
		nav.setPageTampering(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.PageTampering"));
		nav.setFlowHijackJumpTimes(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.FlowHijackJumpTimes"));
		nav.setFlowHijackLogo(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Nav.FlowHijackLogo"));
		taskDetail.setNav(nav);

		Protocol protocol = new Protocol();
		protocol.setCharacterEncoding(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.CharacterEncoding"));
		protocol.setVerifyWay(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.VerifyWay"));
		protocol.setVerifyContent(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.VerifyContent"));
		protocol.setReceivedDataSize(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.ReceivedDataSize"));
		protocol.setProtocolMonitorTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.ProtocolMonitorTimeout"));
		protocol.setProtocolConnectionTimeout(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.ProtocolConnectionTimeout"));
		protocol.setCustomHost(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.CustomHost"));
		protocol.setCustomHostIp(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.CustomHostIp"));

		RequestContent requestContent = new RequestContent();
		requestContent.setBizMethod(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Method"));

		Body body = new Body();
		body.setMode(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Mode"));
		body.setRaw(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Raw"));
		body.setLanguage(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Language"));

		Formdata formdata = new Formdata();
		formdata.setKey(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Formdata.Key"));
		formdata.setValue(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Formdata.Value"));
		body.setFormdata(formdata);

		Urlencoded urlencoded = new Urlencoded();
		urlencoded.setKey(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Urlencoded.Key"));
		urlencoded.setValue(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Body.Urlencoded.Value"));
		body.setUrlencoded(urlencoded);
		requestContent.setBody(body);

		List<HeaderItem> header = new ArrayList<HeaderItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Header.Length"); i++) {
			HeaderItem headerItem = new HeaderItem();
			headerItem.setKey(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Header["+ i +"].Key"));
			headerItem.setValue(_ctx.stringValue("GetSyntheticTaskDetailResponse.TaskDetail.Protocol.RequestContent.Header["+ i +"].Value"));

			header.add(headerItem);
		}
		requestContent.setHeader(header);
		protocol.setRequestContent(requestContent);
		taskDetail.setBizProtocol(protocol);

		List<MinotorListItem> minotorList = new ArrayList<MinotorListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticTaskDetailResponse.TaskDetail.MinotorList.Length"); i++) {
			MinotorListItem minotorListItem = new MinotorListItem();
			minotorListItem.setCityCode(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.MinotorList["+ i +"].CityCode"));
			minotorListItem.setNetServiceId(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.MinotorList["+ i +"].NetServiceId"));
			minotorListItem.setMonitorType(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.MinotorList["+ i +"].MonitorType"));
			minotorListItem.setSendCount(_ctx.longValue("GetSyntheticTaskDetailResponse.TaskDetail.MinotorList["+ i +"].SendCount"));

			minotorList.add(minotorListItem);
		}
		taskDetail.setMinotorList(minotorList);
		getSyntheticTaskDetailResponse.setTaskDetail(taskDetail);
	 
	 	return getSyntheticTaskDetailResponse;
	}
}