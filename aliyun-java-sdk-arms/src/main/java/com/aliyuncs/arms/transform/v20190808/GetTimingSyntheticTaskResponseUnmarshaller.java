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

import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.AvailableAssertion;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CommonSetting;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Host;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomPrometheusSetting;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomVPCSetting;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.CustomPeriod;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.Monitor;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.RequestBody;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.MonitorConf.Website;
import com.aliyuncs.arms.model.v20190808.GetTimingSyntheticTaskResponse.Data.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTimingSyntheticTaskResponseUnmarshaller {

	public static GetTimingSyntheticTaskResponse unmarshall(GetTimingSyntheticTaskResponse getTimingSyntheticTaskResponse, UnmarshallerContext _ctx) {
		
		getTimingSyntheticTaskResponse.setRequestId(_ctx.stringValue("GetTimingSyntheticTaskResponse.RequestId"));
		getTimingSyntheticTaskResponse.setCode(_ctx.longValue("GetTimingSyntheticTaskResponse.Code"));
		getTimingSyntheticTaskResponse.setMessage(_ctx.stringValue("GetTimingSyntheticTaskResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.TaskId"));
		data.setRegionId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.RegionId"));
		data.setName(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Name"));
		data.setTaskType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.TaskType"));
		data.setMonitorCategory(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorCategory"));
		data.setFrequency(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Frequency"));
		data.setStatus(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Status"));
		data.setResourceGroupId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.ResourceGroupId"));

		MonitorConf monitorConf = new MonitorConf();

		NetICMP netICMP = new NetICMP();
		netICMP.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.TargetUrl"));
		netICMP.setInterval(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.Interval"));
		netICMP.setPackageNum(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.PackageNum"));
		netICMP.setPackageSize(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.PackageSize"));
		netICMP.setSplitPackage(_ctx.booleanValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.SplitPackage"));
		netICMP.setTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.Timeout"));
		netICMP.setTracertEnable(_ctx.booleanValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.TracertEnable"));
		netICMP.setTracertNumMax(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.TracertNumMax"));
		netICMP.setTracertTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetICMP.TracertTimeout"));
		monitorConf.setNetICMP(netICMP);

		NetTCP netTCP = new NetTCP();
		netTCP.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.TargetUrl"));
		netTCP.setConnectTimes(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.ConnectTimes"));
		netTCP.setInterval(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.Interval"));
		netTCP.setTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.Timeout"));
		netTCP.setTracertEnable(_ctx.booleanValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.TracertEnable"));
		netTCP.setTracertNumMax(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.TracertNumMax"));
		netTCP.setTracertTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetTCP.TracertTimeout"));
		monitorConf.setNetTCP(netTCP);

		NetDNS netDNS = new NetDNS();
		netDNS.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS.TargetUrl"));
		netDNS.setDnsServerIpType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS.DnsServerIpType"));
		netDNS.setNsServer(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS.NsServer"));
		netDNS.setQueryMethod(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS.QueryMethod"));
		netDNS.setTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.NetDNS.Timeout"));
		monitorConf.setNetDNS(netDNS);

		ApiHTTP apiHTTP = new ApiHTTP();
		apiHTTP.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.TargetUrl"));
		apiHTTP.setBizMethod(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.Method"));
		apiHTTP.setRequestHeaders(_ctx.mapValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.RequestHeaders"));
		apiHTTP.setConnectTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.ConnectTimeout"));
		apiHTTP.setTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.Timeout"));
		apiHTTP.setCheckCert(_ctx.booleanValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.CheckCert"));
		apiHTTP.setProtocolAlpnProtocol(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.ProtocolAlpnProtocol"));

		RequestBody requestBody = new RequestBody();
		requestBody.setContent(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.RequestBody.Content"));
		requestBody.setType(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.ApiHTTP.RequestBody.Type"));
		apiHTTP.setRequestBody(requestBody);
		monitorConf.setApiHTTP(apiHTTP);

		FileDownload fileDownload = new FileDownload();
		fileDownload.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.TargetUrl"));
		fileDownload.setDownloadKernel(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.DownloadKernel"));
		fileDownload.setQuickProtocol(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.QuickProtocol"));
		fileDownload.setConnectionTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.ConnectionTimeout"));
		fileDownload.setCustomHeaderContent(_ctx.mapValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.CustomHeaderContent"));
		fileDownload.setIgnoreCertificateStatusError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateStatusError"));
		fileDownload.setIgnoreCertificateUntrustworthyError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateUntrustworthyError"));
		fileDownload.setIgnoreInvalidHostError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreInvalidHostError"));
		fileDownload.setMonitorTimeout(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.MonitorTimeout"));
		fileDownload.setRedirection(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.Redirection"));
		fileDownload.setTransmissionSize(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.TransmissionSize"));
		fileDownload.setIgnoreCertificateCanceledError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateCanceledError"));
		fileDownload.setIgnoreCertificateAuthError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateAuthError"));
		fileDownload.setIgnoreCertificateOutOfDateError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateOutOfDateError"));
		fileDownload.setIgnoreCertificateUsingError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.IgnoreCertificateUsingError"));
		fileDownload.setVerifyWay(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.VerifyWay"));
		fileDownload.setValidateKeywords(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.ValidateKeywords"));
		fileDownload.setWhiteList(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.FileDownload.WhiteList"));
		monitorConf.setFileDownload(fileDownload);

		Website website = new Website();
		website.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.TargetUrl"));
		website.setAutomaticScrolling(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.AutomaticScrolling"));
		website.setCustomHeader(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.CustomHeader"));
		website.setCustomHeaderContent(_ctx.mapValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.CustomHeaderContent"));
		website.setDisableCache(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.DisableCache"));
		website.setDisableCompression(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.DisableCompression"));
		website.setFilterInvalidIP(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.FilterInvalidIP"));
		website.setIgnoreCertificateError(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.IgnoreCertificateError"));
		website.setMonitorTimeout(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.MonitorTimeout"));
		website.setRedirection(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.Redirection"));
		website.setSlowElementThreshold(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.SlowElementThreshold"));
		website.setWaitCompletionTime(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.WaitCompletionTime"));
		website.setVerifyStringBlacklist(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.VerifyStringBlacklist"));
		website.setVerifyStringWhitelist(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.VerifyStringWhitelist"));
		website.setElementBlacklist(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.ElementBlacklist"));
		website.setDNSHijackWhitelist(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.DNSHijackWhitelist"));
		website.setPageTamper(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.PageTamper"));
		website.setFlowHijackJumpTimes(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.FlowHijackJumpTimes"));
		website.setFlowHijackLogo(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Website.FlowHijackLogo"));
		monitorConf.setWebsite(website);

		Stream stream = new Stream();
		stream.setTargetUrl(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.TargetUrl"));
		stream.setStreamType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.StreamType"));
		stream.setStreamMonitorTimeout(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.StreamMonitorTimeout"));
		stream.setStreamAddressType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.StreamAddressType"));
		stream.setPlayerType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.PlayerType"));
		stream.setCustomHeaderContent(_ctx.mapValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.CustomHeaderContent"));
		stream.setWhiteList(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.MonitorConf.Stream.WhiteList"));
		monitorConf.setStream(stream);
		data.setMonitorConf(monitorConf);

		CustomPeriod customPeriod = new CustomPeriod();
		customPeriod.setEndHour(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.CustomPeriod.EndHour"));
		customPeriod.setStartHour(_ctx.longValue("GetTimingSyntheticTaskResponse.Data.CustomPeriod.StartHour"));
		data.setCustomPeriod(customPeriod);

		CommonSetting commonSetting = new CommonSetting();
		commonSetting.setIpType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.IpType"));
		commonSetting.setMonitorSamples(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.MonitorSamples"));
		commonSetting.setIsOpenTrace(_ctx.booleanValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.IsOpenTrace"));
		commonSetting.setTraceClientType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.TraceClientType"));
		commonSetting.setXtraceRegion(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.XtraceRegion"));

		CustomHost customHost = new CustomHost();
		customHost.setSelectType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.SelectType"));

		List<Host> hosts = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Hosts.Length"); i++) {
			Host host = new Host();
			host.setDomain(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Hosts["+ i +"].Domain"));
			host.setIpType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Hosts["+ i +"].IpType"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Hosts["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomHost.Hosts["+ i +"].Ips["+ j +"]"));
			}
			host.setIps(ips);

			hosts.add(host);
		}
		customHost.setHosts(hosts);
		commonSetting.setCustomHost(customHost);

		CustomVPCSetting customVPCSetting = new CustomVPCSetting();
		customVPCSetting.setRegionId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomVPCSetting.RegionId"));
		customVPCSetting.setVpcId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomVPCSetting.VpcId"));
		customVPCSetting.setVSwitchId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomVPCSetting.VSwitchId"));
		customVPCSetting.setSecureGroupId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomVPCSetting.SecureGroupId"));
		commonSetting.setCustomVPCSetting(customVPCSetting);

		CustomPrometheusSetting customPrometheusSetting = new CustomPrometheusSetting();
		customPrometheusSetting.setPrometheusLabels(_ctx.mapValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomPrometheusSetting.PrometheusLabels"));
		customPrometheusSetting.setPrometheusClusterId(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomPrometheusSetting.PrometheusClusterId"));
		customPrometheusSetting.setPrometheusClusterRegion(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.CommonSetting.CustomPrometheusSetting.PrometheusClusterRegion"));
		commonSetting.setCustomPrometheusSetting(customPrometheusSetting);
		data.setCommonSetting(commonSetting);

		List<Monitor> monitors = new ArrayList<Monitor>();
		for (int i = 0; i < _ctx.lengthValue("GetTimingSyntheticTaskResponse.Data.Monitors.Length"); i++) {
			Monitor monitor = new Monitor();
			monitor.setCityCode(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Monitors["+ i +"].CityCode"));
			monitor.setOperatorCode(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Monitors["+ i +"].OperatorCode"));
			monitor.setClientType(_ctx.integerValue("GetTimingSyntheticTaskResponse.Data.Monitors["+ i +"].ClientType"));

			monitors.add(monitor);
		}
		data.setMonitors(monitors);

		List<AvailableAssertion> availableAssertions = new ArrayList<AvailableAssertion>();
		for (int i = 0; i < _ctx.lengthValue("GetTimingSyntheticTaskResponse.Data.AvailableAssertions.Length"); i++) {
			AvailableAssertion availableAssertion = new AvailableAssertion();
			availableAssertion.setType(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.AvailableAssertions["+ i +"].Type"));
			availableAssertion.setTarget(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.AvailableAssertions["+ i +"].Target"));
			availableAssertion.setOperator(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.AvailableAssertions["+ i +"].Operator"));
			availableAssertion.setExpect(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.AvailableAssertions["+ i +"].Expect"));

			availableAssertions.add(availableAssertion);
		}
		data.setAvailableAssertions(availableAssertions);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetTimingSyntheticTaskResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetTimingSyntheticTaskResponse.Data.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		data.setTags(tags);
		getTimingSyntheticTaskResponse.setData(data);
	 
	 	return getTimingSyntheticTaskResponse;
	}
}